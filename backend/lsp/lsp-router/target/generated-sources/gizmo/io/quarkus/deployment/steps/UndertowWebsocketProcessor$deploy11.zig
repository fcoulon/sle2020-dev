// Class: io/quarkus/deployment/steps/UndertowWebsocketProcessor$deploy11
//     Access =  public synthetic
//     Extends: java/lang/Object
//     Implements:
//         io/quarkus/runtime/StartupTask

// DO NOT MODIFY.  This is not actually a source file; it is a textual representation of generated code.
// Use only for debugging purposes.

// Auto-generated constructor
// Access: public
Method <init> : V
(
    // (no arguments)
) {
    ALOAD 0
    // Method descriptor: ()V
    INVOKESPECIAL java/lang/Object#<init>
    RETURN
    
}

// Access: public
Method deploy : V
(
    arg 1 = Lio/quarkus/runtime/StartupContext;
) {
    ** label1
    LDC (Integer) 7
    ANEWARRAY java/lang/Object
    ASTORE 2
    ALOAD 0
    ALOAD 1
    ALOAD 2
    // Method descriptor: (Lio/quarkus/runtime/StartupContext;[Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/deployment/steps/UndertowWebsocketProcessor$deploy11#deploy_0
    RETURN
    ** label2
    
}

// Access: public
Method deploy_0 : V
(
    arg 1 = Lio/quarkus/runtime/StartupContext;,
    arg 2 = [Ljava/lang/Object;
) {
    ** label1
    NEW java/util/HashSet
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/HashSet#<init>
    ASTORE 3
    ALOAD 2
    LDC (Integer) 1
    ALOAD 3
    AASTORE
    ALOAD 2
    LDC (Integer) 1
    AALOAD
    ASTORE 4
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "fr.inria.diverse.socket.RouterSocket"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 2
    LDC (Integer) 2
    ALOAD 4
    AASTORE
    NEW java/util/HashSet
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/HashSet#<init>
    ASTORE 5
    ALOAD 2
    LDC (Integer) 3
    ALOAD 5
    AASTORE
    ALOAD 2
    LDC (Integer) 3
    AALOAD
    ASTORE 6
    ALOAD 2
    LDC (Integer) 4
    ALOAD 6
    AASTORE
    NEW java/util/HashSet
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/HashSet#<init>
    ASTORE 7
    ALOAD 2
    LDC (Integer) 5
    ALOAD 7
    AASTORE
    ALOAD 2
    LDC (Integer) 5
    AALOAD
    ASTORE 8
    ALOAD 2
    LDC (Integer) 6
    ALOAD 8
    AASTORE
    NEW io/quarkus/undertow/websockets/runtime/UndertowWebsocketRecorder
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL io/quarkus/undertow/websockets/runtime/UndertowWebsocketRecorder#<init>
    ASTORE 9
    ALOAD 2
    LDC (Integer) 0
    ALOAD 9
    AASTORE
    ALOAD 2
    LDC (Integer) 2
    AALOAD
    ASTORE 12
    ALOAD 2
    LDC (Integer) 4
    AALOAD
    ASTORE 10
    ALOAD 2
    LDC (Integer) 6
    AALOAD
    ASTORE 11
    ALOAD 2
    LDC (Integer) 0
    AALOAD
    CHECKCAST io/quarkus/undertow/websockets/runtime/UndertowWebsocketRecorder
    ALOAD 12
    CHECKCAST java/util/Set
    ALOAD 10
    CHECKCAST java/util/Set
    ALOAD 11
    CHECKCAST java/util/Set
    // Method descriptor: (Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;)Lio/undertow/websockets/jsr/WebSocketDeploymentInfo;
    INVOKEVIRTUAL io/quarkus/undertow/websockets/runtime/UndertowWebsocketRecorder#createDeploymentInfo
    ASTORE 13
    ALOAD 1
    LDC (String) "proxykey16"
    ALOAD 13
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    RETURN
    ** label2
    
}

