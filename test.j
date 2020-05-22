.class public T
.super java/lang/Object

.method static public main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
iconst_0
iconst_1
ixor
ifne loop0
ldc 0
istore 1
goto loop1
loop0:
ldc 3
istore 1
loop1:
getstatic java/lang/System.out Ljava/io/PrintStream;
iload 1 
invokevirtual java/io/PrintStream.println(I)V
return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

