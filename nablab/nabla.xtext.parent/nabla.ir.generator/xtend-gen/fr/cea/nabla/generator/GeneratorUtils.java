/**
 * Copyright (c) 2018 CEA
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 * 	Benoit Lelandais - initial implementation
 * 	Marie-Pierre Oudot - initial implementation
 * 	Jean-Sylvain Camier - Nabla generation support
 */
package fr.cea.nabla.generator;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Properties;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class GeneratorUtils {
  public Map<Object, Object> getXmlSaveOptions() {
    final SaveOptions.Builder builder = SaveOptions.newBuilder();
    builder.format();
    final Map<Object, Object> so = builder.getOptions().toOptionsMap();
    so.put(XMLResource.OPTION_LINE_WIDTH, Integer.valueOf(160));
    return so;
  }
  
  public Properties getProperties(final String uri) {
    try {
      final Properties props = new Properties();
      final URL url = new URL(uri);
      try {
        final InputStream inputStream = url.openConnection().getInputStream();
        Charset _forName = Charset.forName("UTF-8");
        InputStreamReader _inputStreamReader = new InputStreamReader(inputStream, _forName);
        props.load(_inputStreamReader);
        inputStream.close();
      } catch (final Throwable _t) {
        if (_t instanceof IOException) {
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      return props;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
