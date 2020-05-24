.class public MonteCarloPi
.super java/lang/Object

.method public performSingleEstimate()ERROR
.limit stack 3
.limit locals 99
ldc 0
ldc 100
isub
ldc 100
invokestatic MathUtils/random(II)I
istore 1
ldc 0
ldc 100
isub
ldc 100
invokestatic MathUtils/random(II)I
istore 2
iload 1
iload 1
imul
iload 2
iload 2
imul
iadd
ldc 100
idiv
istore 4
iload 4
ldc 100
if_icmplt loopTRUE2
iconst_0
goto loopFALSE2
loopTRUE2:
iconst_1
loopFALSE2:
ifne loop0
iconst_0
astore 3
goto loop1
loop0:
iconst_1
astore 3
loop1:
pop
iload 3
areturn
.end method

.method public estimatePi100(I)I
.limit stack 4
.limit locals 99
ldc 0
istore 3
ldc 0
istore 2
loop4:
iload 3
iload 1
if_icmplt loopTRUE5
iconst_0
goto loopFALSE5
loopTRUE5:
iconst_1
loopFALSE5:
ifeq loop3
aload_0
invokevirtual MonteCarloPi/performSingleEstimate()ERROR
ifne loop6
goto loop7
loop6:
iload 2
ldc 1
iadd
istore 2
loop7:
iload 3
ldc 1
iadd
istore 3
goto loop4
loop3:
ldc 400
iload 2
imul
iload 1
idiv
istore 4
pop
pop
iload 4
ireturn
.end method

.method static public main([Ljava/lang/String;)V
.limit stack 2
.limit locals 99
invokestatic ioPlus/requestNumber()I
istore 2
new MonteCarloPi
dup
invokespecial MonteCarloPi/<init>()V
iload 2
invokevirtual MonteCarloPi/estimatePi100(I)I
istore 1
iload 1
invokestatic ioPlus/printResult(I)V
return
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method

