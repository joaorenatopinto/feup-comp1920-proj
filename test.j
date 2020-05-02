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
istore 1
aload 3
ldc 1
iaload
ldc 2
imul
istore 2
return
.end method

.method public ola()[I
.limit stack 99
.limit locals 99
ldc 4
newarray int
astore 1
iload 1
return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

