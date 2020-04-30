.class public Test
.super java/lang/Object

.field public joao I

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

.method public static main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
ldc 5
istore 2
ldc 9
ldc 5
idiv
istore 3

getstatic java/lang/System.out Ljava/io/PrintStream;
iload 3
invokevirtual java/io/PrintStream.println(I)V

return
.end method

;getstatic java/lang/System.out Ljava/io/PrintStream;
;iload 3
;invokevirtual java/io/PrintStream.println(I)V