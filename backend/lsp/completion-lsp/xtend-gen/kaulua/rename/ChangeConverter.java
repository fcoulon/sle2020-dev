/**
 * Copyright (c) 2017 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package kaulua.rename;

import com.google.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import kaulua.common.Document;
import kaulua.serializer.IEmfResourceChange;
import kaulua.serializer.ITextDocumentChange;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.TextEdit;
import org.eclipse.lsp4j.WorkspaceEdit;
import org.eclipse.xtext.formatting2.regionaccess.ITextReplacement;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author koehnlein - Initial contribution and API
 * @since 2.13
 */
@SuppressWarnings("all")
public class ChangeConverter implements IAcceptor<IEmfResourceChange> {
  public static class Factory {
    @Inject
    private IResourceServiceProvider.Registry registry;
    
    public ChangeConverter create(final Document document, final Resource resource, final WorkspaceEdit edit) {
      return new ChangeConverter(document, resource, this.registry, edit);
    }
  }
  
  private final IResourceServiceProvider.Registry registry;
  
  private final WorkspaceEdit edit;
  
  private Document document;
  
  private Resource resource;
  
  protected ChangeConverter(final Document document, final Resource resource, final IResourceServiceProvider.Registry registry, final WorkspaceEdit edit) {
    this.registry = registry;
    this.edit = edit;
    this.document = document;
    this.resource = resource;
  }
  
  @Override
  public void accept(final IEmfResourceChange change) {
    this.handleReplacements(change);
  }
  
  protected void _handleReplacements(final IEmfResourceChange change) {
    try {
      final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      try {
        final URI uri = change.getResource().getURI();
        change.getResource().save(outputStream, null);
        byte[] _byteArray = outputStream.toByteArray();
        String _charset = this.getCharset(change.getResource());
        final String newContent = new String(_byteArray, _charset);
        Position _position = this.document.getPosition(0);
        Position _position_1 = this.document.getPosition(this.document.getContents().length());
        final Range range = new Range(_position, _position_1);
        final TextEdit textEdit = new TextEdit(range, newContent);
        this.addTextEdit(uri, textEdit);
      } finally {
        outputStream.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String getCharset(final Resource resource) {
    String _xblockexpression = null;
    {
      final IEncodingProvider xtextEncodingProvider = this.registry.getResourceServiceProvider(resource.getURI()).<IEncodingProvider>get(IEncodingProvider.class);
      String _xifexpression = null;
      if ((xtextEncodingProvider != null)) {
        return xtextEncodingProvider.getEncoding(resource.getURI());
      } else {
        String _xifexpression_1 = null;
        if ((resource instanceof XMLResource)) {
          _xifexpression_1 = ((XMLResource)resource).getEncoding();
        } else {
          _xifexpression_1 = Charset.defaultCharset().toString();
        }
        _xifexpression = _xifexpression_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected void _handleReplacements(final ITextDocumentChange change) {
    int _size = change.getReplacements().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final URI uri = change.getNewURI();
      final Function1<ITextReplacement, TextEdit> _function = (ITextReplacement replacement) -> {
        TextEdit _xblockexpression = null;
        {
          final Position start = this.document.getPosition(replacement.getOffset());
          int _offset = replacement.getOffset();
          int _length = replacement.getLength();
          int _plus = (_offset + _length);
          final Position end = this.document.getPosition(_plus);
          final Range range = new Range(start, end);
          String _replacementText = replacement.getReplacementText();
          _xblockexpression = new TextEdit(range, _replacementText);
        }
        return _xblockexpression;
      };
      final List<TextEdit> textEdits = ListExtensions.<ITextReplacement, TextEdit>map(change.getReplacements(), _function);
      this.addTextEdit(uri, ((TextEdit[])Conversions.unwrapArray(textEdits, TextEdit.class)));
    }
  }
  
  protected List<TextEdit> addTextEdit(final URI uri, final TextEdit... textEdit) {
    return this.edit.getChanges().put(uri.toString(), ((List<TextEdit>)Conversions.doWrapArray(textEdit)));
  }
  
  protected void handleReplacements(final IEmfResourceChange change) {
    if (change instanceof ITextDocumentChange) {
      _handleReplacements((ITextDocumentChange)change);
      return;
    } else if (change != null) {
      _handleReplacements(change);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(change).toString());
    }
  }
}
