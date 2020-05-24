.class public Simple
.super java/lang/Object

.method static public main([Ljava/lang/String;)V
.limit stack 3
.limit locals 99
new Simple
dup
invokespecial Simple/<init>()V
astore 1
aload 1
ldc 5
ldc 10
invokevirtual Simple/add(II)I
istore 2
return
.end method

.method public add(II)I
.limit stack 2
.limit locals 99
iload 1
iload 2
iadd
ireturn
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

