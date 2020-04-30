.class public Test
.super java/lang/Object

.field public joao I
.method static public main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
ldc 2
newarray int
astore 3
aload 3
ldc 1
ldc 100
iastore
aload 3
ldc 1
iaload
istore 1
iload 1
ldc 2
iadd
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
;iload 2
;invokevirtual java/io/PrintStream.println(I)V





