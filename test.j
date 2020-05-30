.class public T
.super java/lang/Object

.method static public main([Ljava/lang/String;)V
.limit stack 2
.limit locals 3
iconst_0
istore 1
iload 1
iflt loopTRUE0
iconst_0
goto loopFALSE0
loopTRUE0:
iconst_1
loopFALSE0:
istore 2
return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
