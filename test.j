.class public Test
.super java/lang/Object

.field static joao I
.method static public main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
bipush 2
putstatic Test/joao I
ldc 5
istore 1
getstatic Test/joao I
istore 2

getstatic java/lang/System.out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream.println(I)V

return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

;getstatic java/lang/System.out Ljava/io/PrintStream;
;iload 3
;invokevirtual java/io/PrintStream.println(I)V