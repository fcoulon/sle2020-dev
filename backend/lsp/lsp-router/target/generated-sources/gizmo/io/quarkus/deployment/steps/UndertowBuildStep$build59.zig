// Class: io/quarkus/deployment/steps/UndertowBuildStep$build59
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
    LDC (Integer) 21
    ANEWARRAY java/lang/Object
    ASTORE 2
    ALOAD 0
    ALOAD 1
    ALOAD 2
    // Method descriptor: (Lio/quarkus/runtime/StartupContext;[Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/deployment/steps/UndertowBuildStep$build59#deploy_0
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
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.css.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-standalone-preset.js"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/oauth2-redirect.html.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.js.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/index.html"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.js.map"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-standalone-preset.js.map"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/favicon-32x32.png"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/index.html.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.css.map"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-standalone-preset.js.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.js"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "quarkus-generated-openapi-doc.JSON"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui.css"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-bundle.js"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-bundle.js.gz"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "quarkus-generated-openapi-doc.YAML"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/swagger-ui-bundle.js.map"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "index.html"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/favicon-16x16.png"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 4
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9/oauth2-redirect.html"
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
    ALOAD 6
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 6
    CHECKCAST java/util/Collection
    LDC (String) "webjars/swagger-ui/3.20.9"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 6
    CHECKCAST java/util/Collection
    LDC (String) "webjars"
    // Method descriptor: (Ljava/lang/Object;)Z
    INVOKEINTERFACE java/util/Collection#add
    POP
    ALOAD 2
    LDC (Integer) 4
    ALOAD 6
    AASTORE
    NEW io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#<init>
    ASTORE 7
    ALOAD 2
    LDC (Integer) 0
    ALOAD 7
    AASTORE
    ALOAD 2
    LDC (Integer) 2
    AALOAD
    ASTORE 10
    ALOAD 2
    LDC (Integer) 4
    AALOAD
    ASTORE 11
    LDC (String) "NORMAL"
    // Method descriptor: (Ljava/lang/String;)Lio/quarkus/runtime/LaunchMode;
    INVOKESTATIC io/quarkus/runtime/LaunchMode#valueOf
    ASTORE 8
    ALOAD 1
    LDC (String) "io.quarkus.runtime.ShutdownContext"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 9
    ALOAD 2
    LDC (Integer) 0
    AALOAD
    ASTORE 17
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    LDC (String) "test"
    ALOAD 10
    CHECKCAST java/util/Set
    ALOAD 11
    CHECKCAST java/util/Set
    ALOAD 8
    ALOAD 9
    CHECKCAST io/quarkus/runtime/ShutdownContext
    LDC (String) "/"
    // Method descriptor: (Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;Lio/quarkus/runtime/LaunchMode;Lio/quarkus/runtime/ShutdownContext;Ljava/lang/String;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#createDeployment
    ASTORE 12
    ALOAD 1
    LDC (String) "proxykey113"
    ALOAD 12
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 13
    ALOAD 2
    LDC (Integer) 5
    ALOAD 13
    AASTORE
    ALOAD 2
    LDC (Integer) 5
    AALOAD
    ASTORE 14
    ALOAD 2
    LDC (Integer) 6
    ALOAD 14
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 18
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 15
    LDC (String) "io.quarkus.smallrye.metrics.runtime.SmallRyeMetricsServlet"
    LDC (Boolean) true
    ALOAD 15
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 20
    LDC (Boolean) false
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 21
    LDC (Integer) 0
    // Method descriptor: (I)Ljava/lang/Integer;
    INVOKESTATIC java/lang/Integer#valueOf
    ASTORE 19
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 22
    ALOAD 2
    LDC (Integer) 6
    AALOAD
    ASTORE 16
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 18
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "metrics"
    ALOAD 20
    ALOAD 21
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 19
    CHECKCAST java/lang/Integer
    // Method descriptor: ()I
    INVOKEVIRTUAL java/lang/Integer#intValue
    ALOAD 22
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 16
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZILio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerServlet
    ASTORE 23
    ALOAD 1
    LDC (String) "proxykey115"
    ALOAD 23
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 24
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 24
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "metrics"
    LDC (String) "/metrics/*"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 25
    ALOAD 2
    LDC (Integer) 7
    ALOAD 25
    AASTORE
    ALOAD 2
    LDC (Integer) 7
    AALOAD
    ASTORE 26
    ALOAD 2
    LDC (Integer) 8
    ALOAD 26
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 33
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 27
    LDC (String) "io.quarkus.smallrye.openapi.runtime.OpenApiServlet"
    LDC (Boolean) true
    ALOAD 27
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 28
    LDC (Boolean) false
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 31
    LDC (Integer) 0
    // Method descriptor: (I)Ljava/lang/Integer;
    INVOKESTATIC java/lang/Integer#valueOf
    ASTORE 29
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 32
    ALOAD 2
    LDC (Integer) 8
    AALOAD
    ASTORE 30
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 33
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "openapi"
    ALOAD 28
    ALOAD 31
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 29
    CHECKCAST java/lang/Integer
    // Method descriptor: ()I
    INVOKEVIRTUAL java/lang/Integer#intValue
    ALOAD 32
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 30
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZILio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerServlet
    ASTORE 34
    ALOAD 1
    LDC (String) "proxykey117"
    ALOAD 34
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 35
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 35
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "openapi"
    LDC (String) "/openapi"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 36
    ALOAD 2
    LDC (Integer) 9
    ALOAD 36
    AASTORE
    ALOAD 2
    LDC (Integer) 9
    AALOAD
    ASTORE 37
    ALOAD 2
    LDC (Integer) 10
    ALOAD 37
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 44
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 38
    LDC (String) "io.quarkus.smallrye.health.runtime.SmallRyeHealthServlet"
    LDC (Boolean) true
    ALOAD 38
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 41
    LDC (Boolean) false
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 42
    LDC (Integer) 0
    // Method descriptor: (I)Ljava/lang/Integer;
    INVOKESTATIC java/lang/Integer#valueOf
    ASTORE 39
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 40
    ALOAD 2
    LDC (Integer) 10
    AALOAD
    ASTORE 43
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 44
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "health"
    ALOAD 41
    ALOAD 42
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 39
    CHECKCAST java/lang/Integer
    // Method descriptor: ()I
    INVOKEVIRTUAL java/lang/Integer#intValue
    ALOAD 40
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 43
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZILio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerServlet
    ASTORE 45
    ALOAD 1
    LDC (String) "proxykey119"
    ALOAD 45
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 46
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 46
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "health"
    LDC (String) "/health"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 47
    ALOAD 2
    LDC (Integer) 11
    ALOAD 47
    AASTORE
    ALOAD 2
    LDC (Integer) 11
    AALOAD
    ASTORE 48
    ALOAD 2
    LDC (Integer) 12
    ALOAD 48
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 52
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 49
    LDC (String) "io.quarkus.smallrye.health.runtime.SmallRyeLivenessServlet"
    LDC (Boolean) true
    ALOAD 49
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 50
    LDC (Boolean) false
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 53
    LDC (Integer) 0
    // Method descriptor: (I)Ljava/lang/Integer;
    INVOKESTATIC java/lang/Integer#valueOf
    ASTORE 54
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 55
    ALOAD 2
    LDC (Integer) 12
    AALOAD
    ASTORE 51
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 52
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "liveness"
    ALOAD 50
    ALOAD 53
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 54
    CHECKCAST java/lang/Integer
    // Method descriptor: ()I
    INVOKEVIRTUAL java/lang/Integer#intValue
    ALOAD 55
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 51
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZILio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerServlet
    ASTORE 56
    ALOAD 1
    LDC (String) "proxykey121"
    ALOAD 56
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 57
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 57
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "liveness"
    LDC (String) "/health/live"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 58
    ALOAD 2
    LDC (Integer) 13
    ALOAD 58
    AASTORE
    ALOAD 2
    LDC (Integer) 13
    AALOAD
    ASTORE 59
    ALOAD 2
    LDC (Integer) 14
    ALOAD 59
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 61
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 60
    LDC (String) "io.quarkus.smallrye.health.runtime.SmallRyeReadinessServlet"
    LDC (Boolean) true
    ALOAD 60
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 63
    LDC (Boolean) false
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 66
    LDC (Integer) 0
    // Method descriptor: (I)Ljava/lang/Integer;
    INVOKESTATIC java/lang/Integer#valueOf
    ASTORE 65
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 62
    ALOAD 2
    LDC (Integer) 14
    AALOAD
    ASTORE 64
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 61
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "readiness"
    ALOAD 63
    ALOAD 66
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 65
    CHECKCAST java/lang/Integer
    // Method descriptor: ()I
    INVOKEVIRTUAL java/lang/Integer#intValue
    ALOAD 62
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 64
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZILio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerServlet
    ASTORE 67
    ALOAD 1
    LDC (String) "proxykey123"
    ALOAD 67
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 68
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 68
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "readiness"
    LDC (String) "/health/ready"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 69
    ALOAD 2
    LDC (Integer) 15
    ALOAD 69
    AASTORE
    ALOAD 2
    LDC (Integer) 15
    AALOAD
    ASTORE 70
    ALOAD 2
    LDC (Integer) 16
    ALOAD 70
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 74
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 71
    LDC (String) "io.opentracing.contrib.jaxrs2.server.SpanFinishingFilter"
    LDC (Boolean) true
    ALOAD 71
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 73
    LDC (Boolean) true
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 72
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 76
    ALOAD 2
    LDC (Integer) 16
    AALOAD
    ASTORE 75
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 74
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    ALOAD 73
    ALOAD 72
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 76
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 75
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZLio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerFilter
    ASTORE 77
    ALOAD 1
    LDC (String) "proxykey125"
    ALOAD 77
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 78
    LDC (String) "FORWARD"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 79
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 78
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    LDC (String) "*"
    ALOAD 79
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterURLMapping
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 81
    LDC (String) "INCLUDE"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 80
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 81
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    LDC (String) "*"
    ALOAD 80
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterURLMapping
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 83
    LDC (String) "REQUEST"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 82
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 83
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    LDC (String) "*"
    ALOAD 82
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterURLMapping
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 85
    LDC (String) "ASYNC"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 84
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 85
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    LDC (String) "*"
    ALOAD 84
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterURLMapping
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 87
    LDC (String) "ERROR"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 86
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 87
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "tracingFilter"
    LDC (String) "*"
    ALOAD 86
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterURLMapping
    NEW java/util/LinkedHashMap
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/LinkedHashMap#<init>
    ASTORE 88
    ALOAD 2
    LDC (Integer) 17
    ALOAD 88
    AASTORE
    ALOAD 2
    LDC (Integer) 17
    AALOAD
    ASTORE 89
    ALOAD 2
    LDC (Integer) 18
    ALOAD 89
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 95
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 90
    LDC (String) "io.quarkus.resteasy.runtime.ResteasyFilter"
    LDC (Boolean) true
    ALOAD 90
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 91
    LDC (Boolean) true
    // Method descriptor: (Z)Ljava/lang/Boolean;
    INVOKESTATIC java/lang/Boolean#valueOf
    ASTORE 94
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 93
    ALOAD 2
    LDC (Integer) 18
    AALOAD
    ASTORE 92
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 95
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "javax.ws.rs.core.Application"
    ALOAD 91
    ALOAD 94
    CHECKCAST java/lang/Boolean
    // Method descriptor: ()Z
    INVOKEVIRTUAL java/lang/Boolean#booleanValue
    ALOAD 93
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 92
    CHECKCAST java/util/Map
    ACONST_NULL
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Class;ZLio/quarkus/arc/runtime/BeanContainer;Ljava/util/Map;Lio/undertow/servlet/api/InstanceFactory;)Lio/quarkus/runtime/RuntimeValue;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerFilter
    ASTORE 96
    ALOAD 1
    LDC (String) "proxykey127"
    ALOAD 96
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 97
    LDC (String) "REQUEST"
    // Method descriptor: (Ljava/lang/String;)Ljavax/servlet/DispatcherType;
    INVOKESTATIC javax/servlet/DispatcherType#valueOf
    ASTORE 98
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 97
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "javax.ws.rs.core.Application"
    LDC (String) "default"
    ALOAD 98
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;Ljavax/servlet/DispatcherType;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addFilterServletNameMapping
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 99
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 99
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "resteasy.injector.factory"
    LDC (String) "io.quarkus.resteasy.server.common.runtime.QuarkusInjectorFactory"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletInitParameter
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 100
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 100
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "resteasy.providers"
    LDC (String) "io.quarkus.resteasy.runtime.RolesFilterRegistrar,io.quarkus.smallrye.opentracing.runtime.QuarkusSmallRyeTracingDynamicFeature"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletInitParameter
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 101
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 101
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "resteasy.scanned.resources"
    LDC (String) "fr.inria.diverse.lsp.resources.DiagnosticsHandler"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletInitParameter
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 102
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 102
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "resteasy.use.builtin.providers"
    LDC (String) "true"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletInitParameter
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 103
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 103
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "resteasy.servlet.mapping.prefix"
    LDC (String) "/"
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/String;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletInitParameter
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 104
    ALOAD 1
    LDC (String) "proxykey92"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 105
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 104
    CHECKCAST io/quarkus/runtime/RuntimeValue
    LDC (String) "io.undertow.websockets.jsr.WebSocketDeploymentInfo"
    ALOAD 105
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletContextAttribute
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 106
    ALOAD 1
    LDC (String) "proxykey109"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 107
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 106
    CHECKCAST io/quarkus/runtime/RuntimeValue
    ALOAD 107
    CHECKCAST io/undertow/servlet/ServletExtension
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Lio/undertow/servlet/ServletExtension;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletExtension
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 110
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 108
    LDC (String) "io.quarkus.undertow.runtime.HttpSessionContext"
    LDC (Boolean) true
    ALOAD 108
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 111
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 109
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 110
    CHECKCAST io/quarkus/runtime/RuntimeValue
    ALOAD 111
    ALOAD 109
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/Class;Lio/quarkus/arc/runtime/BeanContainer;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#registerListener
    NEW java/util/HashSet
    DUP
    // Method descriptor: ()V
    INVOKESPECIAL java/util/HashSet#<init>
    ASTORE 112
    ALOAD 2
    LDC (Integer) 19
    ALOAD 112
    AASTORE
    ALOAD 2
    LDC (Integer) 19
    AALOAD
    ASTORE 113
    ALOAD 2
    LDC (Integer) 20
    ALOAD 113
    AASTORE
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 116
    // Method descriptor: ()Ljava/lang/Thread;
    INVOKESTATIC java/lang/Thread#currentThread
    // Method descriptor: ()Ljava/lang/ClassLoader;
    INVOKEVIRTUAL java/lang/Thread#getContextClassLoader
    ASTORE 114
    LDC (String) "io.undertow.servlet.sse.ServerSentEventSCI"
    LDC (Boolean) true
    ALOAD 114
    // Method descriptor: (Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    INVOKESTATIC java/lang/Class#forName
    ASTORE 117
    ALOAD 2
    LDC (Integer) 20
    AALOAD
    ASTORE 115
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 116
    CHECKCAST io/quarkus/runtime/RuntimeValue
    ALOAD 117
    ALOAD 115
    CHECKCAST java/util/Set
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Ljava/lang/Class;Ljava/util/Set;)V
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#addServletContainerInitializer
    ALOAD 1
    LDC (String) "proxykey113"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 118
    ALOAD 1
    LDC (String) "proxykey102"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 120
    LDC (String) "NORMAL"
    // Method descriptor: (Ljava/lang/String;)Lio/quarkus/runtime/LaunchMode;
    INVOKESTATIC io/quarkus/runtime/LaunchMode#valueOf
    ASTORE 119
    ALOAD 1
    LDC (String) "io.quarkus.runtime.ShutdownContext"
    // Method descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#getValue
    ASTORE 121
    ALOAD 17
    CHECKCAST io/quarkus/undertow/runtime/UndertowDeploymentRecorder
    ALOAD 118
    CHECKCAST io/quarkus/runtime/RuntimeValue
    ALOAD 120
    CHECKCAST io/quarkus/arc/runtime/BeanContainer
    ALOAD 119
    ALOAD 121
    CHECKCAST io/quarkus/runtime/ShutdownContext
    // Method descriptor: (Lio/quarkus/runtime/RuntimeValue;Lio/quarkus/arc/runtime/BeanContainer;Lio/quarkus/runtime/LaunchMode;Lio/quarkus/runtime/ShutdownContext;)Lio/undertow/servlet/api/DeploymentManager;
    INVOKEVIRTUAL io/quarkus/undertow/runtime/UndertowDeploymentRecorder#bootServletContainer
    ASTORE 122
    ALOAD 1
    LDC (String) "proxykey131"
    ALOAD 122
    // Method descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    INVOKEVIRTUAL io/quarkus/runtime/StartupContext#putValue
    RETURN
    ** label2
    
}

