.class public FindMaximum
.super java/lang/Object

.method public find_maximum([I)I
.limit stack 99
.limit locals 99
ldc 1
istore 2
aload 1
ldc 0
iaload
istore 3
loop1:
iload 2
arraylength
if_icmplt loopTRUE2
iconst_0
goto loopFALSE2
loopTRUE2:
iconst_1
loopFALSE2:
ifeq loop0
aload 1
iload 2
iaload
istore 4
iload 3
iload 4
if_icmplt loopTRUE5
iconst_0
goto loopFALSE5
loopTRUE5:
iconst_1
loopFALSE5:
ifne loop3
goto loop4
loop3:
iload 4
istore 3
loop4:
iload 2
ldc 1
iadd
istore 2
goto loop1
loop0:
iload 3
ireturn
.end method

.method public build_test_arr()I
.limit stack 99
.limit locals 99
ldc 5
newarray int
astore 1
aload 1
ldc 0
ldc 14
iastore
aload 1
ldc 1
ldc 28
iastore
aload 1
ldc 2
ldc 0
iastore
aload 1
ldc 3
ldc 0
ldc 5
isub
iastore
aload 1
ldc 4
ldc 12
iastore
ldc 0
ireturn
.end method

.method public get_array()[I
.limit stack 99
.limit locals 99
ldc 5
newarray int
astore 1
aload 1
ldc 0
ldc 14
iastore
aload 1
ldc 1
ldc 28
iastore
aload 1
ldc 2
ldc 0
iastore
aload 1
ldc 3
ldc 0
ldc 5
isub
iastore
aload 1
ldc 4
ldc 12
iastore
aload 1
areturn
.end method

.method static public main([Ljava/lang/String;)V
.limit stack 99
.limit locals 99
new FindMaximum
dup
invokespecial FindMaximum/<init>()V
astore 1
aload 1
aload 1
aload 1
invokevirtual FindMaximum/build_test_arr()I
invokevirtual FindMaximum/get_array()[I
invokevirtual FindMaximum/find_maximum([I)I
invokestatic ioPlus/printResult(I)V
return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

