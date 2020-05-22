.class public T
.super java/lang/Object

.method static public main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
ldc 0
istore 1
ldc 0
istore 2
loop1:
iload 1
ldc 2
if_icmplt loopTRUE2
iconst_0
goto loopFALSE2
loopTRUE2:
iconst_1
loopFALSE2:
ifeq loop0
iload 1
ldc 1
iadd
istore 1
iload 2
ldc 1
iadd
istore 2
goto loop1
loop0:
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

