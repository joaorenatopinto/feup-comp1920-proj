.class public Life
.super java/lang/Object

.field public UNDERPOP_LIM I
.field public OVERPOP_LIM I
.field public REPRODUCE_NUM I
.field public LOOPS_PER_MS I
.field public xMax I
.field public yMax I
.field public field1 [I
.method static public main([Ljava/lang/String;)V
.limit stack 2
.limit locals 3
new Life
dup
invokespecial Life/<init>()V
astore 1
aload 1
invokevirtual Life/init()Z
pop
loop1:
iconst_1
ifeq loop0
aload 1
invokevirtual Life/printField()Z
pop
aload 1
invokevirtual Life/update()Z
pop
invokestatic io/read()I
istore 2
goto loop1
loop0:
return
.end method

.method public init()Z
.limit stack 3
.limit locals 3
iconst_1
newarray int
astore 1
aload_0
iconst_2
putfield Life/UNDERPOP_LIM I
aload_0
iconst_3
putfield Life/OVERPOP_LIM I
aload_0
iconst_3
putfield Life/REPRODUCE_NUM I
aload_0
ldc 225000
putfield Life/LOOPS_PER_MS I
aload_0
aload_0
aload 1
invokevirtual Life/field([I)[I
putfield Life/field1 [I
aload 1
iconst_0
iaload
istore 2
aload_0
iload 2
iconst_1
isub
putfield Life/xMax I
aload_0
aload_0
getfield Life/field1 [I
arraylength
iload 2
idiv
iconst_1
isub
putfield Life/yMax I
iconst_1
ireturn
.end method

.method public field([I)[I
.limit stack 3
.limit locals 3
bipush 100
newarray int
astore 2
aload 1
iconst_0
bipush 10
iastore
aload 2
iconst_0
iconst_0
iastore
aload 2
iconst_1
iconst_0
iastore
aload 2
iconst_2
iconst_1
iastore
aload 2
iconst_3
iconst_0
iastore
aload 2
iconst_4
iconst_0
iastore
aload 2
iconst_5
iconst_0
iastore
aload 2
bipush 6
iconst_0
iastore
aload 2
bipush 7
iconst_0
iastore
aload 2
bipush 8
iconst_0
iastore
aload 2
bipush 9
iconst_0
iastore
aload 2
bipush 10
iconst_1
iastore
aload 2
bipush 11
iconst_0
iastore
aload 2
bipush 12
iconst_1
iastore
aload 2
bipush 13
iconst_0
iastore
aload 2
bipush 14
iconst_0
iastore
aload 2
bipush 15
iconst_0
iastore
aload 2
bipush 16
iconst_0
iastore
aload 2
bipush 17
iconst_0
iastore
aload 2
bipush 18
iconst_0
iastore
aload 2
bipush 19
iconst_0
iastore
aload 2
bipush 20
iconst_0
iastore
aload 2
bipush 21
iconst_1
iastore
aload 2
bipush 22
iconst_1
iastore
aload 2
bipush 23
iconst_0
iastore
aload 2
bipush 24
iconst_0
iastore
aload 2
bipush 25
iconst_0
iastore
aload 2
bipush 26
iconst_0
iastore
aload 2
bipush 27
iconst_0
iastore
aload 2
bipush 28
iconst_0
iastore
aload 2
bipush 29
iconst_0
iastore
aload 2
bipush 30
iconst_0
iastore
aload 2
bipush 31
iconst_0
iastore
aload 2
bipush 32
iconst_0
iastore
aload 2
bipush 33
iconst_0
iastore
aload 2
bipush 34
iconst_0
iastore
aload 2
bipush 35
iconst_0
iastore
aload 2
bipush 36
iconst_0
iastore
aload 2
bipush 37
iconst_0
iastore
aload 2
bipush 38
iconst_0
iastore
aload 2
bipush 39
iconst_0
iastore
aload 2
bipush 40
iconst_0
iastore
aload 2
bipush 41
iconst_0
iastore
aload 2
bipush 42
iconst_0
iastore
aload 2
bipush 43
iconst_0
iastore
aload 2
bipush 44
iconst_0
iastore
aload 2
bipush 45
iconst_0
iastore
aload 2
bipush 46
iconst_0
iastore
aload 2
bipush 47
iconst_0
iastore
aload 2
bipush 48
iconst_0
iastore
aload 2
bipush 49
iconst_0
iastore
aload 2
bipush 50
iconst_0
iastore
aload 2
bipush 51
iconst_0
iastore
aload 2
bipush 52
iconst_0
iastore
aload 2
bipush 53
iconst_0
iastore
aload 2
bipush 54
iconst_0
iastore
aload 2
bipush 55
iconst_0
iastore
aload 2
bipush 56
iconst_0
iastore
aload 2
bipush 57
iconst_0
iastore
aload 2
bipush 58
iconst_0
iastore
aload 2
bipush 59
iconst_0
iastore
aload 2
bipush 60
iconst_0
iastore
aload 2
bipush 61
iconst_0
iastore
aload 2
bipush 62
iconst_0
iastore
aload 2
bipush 63
iconst_0
iastore
aload 2
bipush 64
iconst_0
iastore
aload 2
bipush 65
iconst_0
iastore
aload 2
bipush 66
iconst_0
iastore
aload 2
bipush 67
iconst_0
iastore
aload 2
bipush 68
iconst_0
iastore
aload 2
bipush 69
iconst_0
iastore
aload 2
bipush 70
iconst_0
iastore
aload 2
bipush 71
iconst_0
iastore
aload 2
bipush 72
iconst_0
iastore
aload 2
bipush 73
iconst_0
iastore
aload 2
bipush 74
iconst_0
iastore
aload 2
bipush 75
iconst_0
iastore
aload 2
bipush 76
iconst_0
iastore
aload 2
bipush 77
iconst_0
iastore
aload 2
bipush 78
iconst_0
iastore
aload 2
bipush 79
iconst_0
iastore
aload 2
bipush 80
iconst_0
iastore
aload 2
bipush 81
iconst_0
iastore
aload 2
bipush 82
iconst_0
iastore
aload 2
bipush 83
iconst_0
iastore
aload 2
bipush 84
iconst_0
iastore
aload 2
bipush 85
iconst_0
iastore
aload 2
bipush 86
iconst_0
iastore
aload 2
bipush 87
iconst_0
iastore
aload 2
bipush 88
iconst_0
iastore
aload 2
bipush 89
iconst_0
iastore
aload 2
bipush 90
iconst_0
iastore
aload 2
bipush 91
iconst_0
iastore
aload 2
bipush 92
iconst_0
iastore
aload 2
bipush 93
iconst_0
iastore
aload 2
bipush 94
iconst_0
iastore
aload 2
bipush 95
iconst_0
iastore
aload 2
bipush 96
iconst_0
iastore
aload 2
bipush 97
iconst_0
iastore
aload 2
bipush 98
iconst_0
iastore
aload 2
bipush 99
iconst_0
iastore
aload 2
areturn
.end method

.method public update()Z
.limit stack 4
.limit locals 6
aload_0
getfield Life/field1 [I
arraylength
newarray int
astore 5
iconst_0
istore 1
loop3:
iload 1
aload_0
getfield Life/field1 [I
arraylength
if_icmplt loopTRUE4
iconst_0
goto loopFALSE4
loopTRUE4:
iconst_1
loopFALSE4:
ifeq loop2
aload_0
getfield Life/field1 [I
iload 1
iaload
istore 2
aload_0
iload 1
invokevirtual Life/getLiveNeighborN(I)I
istore 3
iload 2
iconst_1
if_icmplt loopTRUE7
iconst_0
goto loopFALSE7
loopTRUE7:
iconst_1
loopFALSE7:
iconst_1
ixor
ifne loop5
aload_0
iload 3
aload_0
getfield Life/REPRODUCE_NUM I
invokevirtual Life/eq(II)Z
ifne loop8
aload 5
iload 1
aload_0
getfield Life/field1 [I
iload 1
iaload
iastore
goto loop9
loop8:
aload 5
iload 1
iconst_1
iastore
loop9:
goto loop6
loop5:
aload_0
iload 3
aload_0
getfield Life/UNDERPOP_LIM I
invokevirtual Life/ge(II)Z
aload_0
iload 3
aload_0
getfield Life/OVERPOP_LIM I
invokevirtual Life/le(II)Z
iand
istore 4
iload 4
iconst_1
ixor
ifne loop10
aload 5
iload 1
aload_0
getfield Life/field1 [I
iload 1
iaload
iastore
goto loop11
loop10:
aload 5
iload 1
iconst_0
iastore
loop11:
loop6:
iinc 1 1
goto loop3
loop2:
aload_0
aload 5
putfield Life/field1 [I
iconst_1
ireturn
.end method

.method public printField()Z
.limit stack 3
.limit locals 3
iconst_0
istore 1
iconst_0
istore 2
loop13:
iload 1
aload_0
getfield Life/field1 [I
arraylength
if_icmplt loopTRUE14
iconst_0
goto loopFALSE14
loopTRUE14:
iconst_1
loopFALSE14:
ifeq loop12
aload_0
iload 2
aload_0
getfield Life/xMax I
invokevirtual Life/gt(II)Z
ifne loop15
goto loop16
loop15:
invokestatic io/println()V
iconst_0
istore 2
loop16:
aload_0
getfield Life/field1 [I
iload 1
iaload
invokestatic io/print(I)V
iinc 1 1
iinc 2 1
goto loop13
loop12:
invokestatic io/println()V
invokestatic io/println()V
iconst_1
ireturn
.end method

.method public trIdx(II)I
.limit stack 3
.limit locals 3
iload 1
aload_0
getfield Life/xMax I
iconst_1
iadd
iload 2
imul
iadd
ireturn
.end method

.method public cartIdx(I)[I
.limit stack 3
.limit locals 6
aload_0
getfield Life/xMax I
iconst_1
iadd
istore 4
iload 1
iload 4
idiv
istore 3
iload 1
iload 3
iload 4
imul
isub
istore 2
iconst_2
newarray int
astore 5
aload 5
iconst_0
iload 2
iastore
aload 5
iconst_1
iload 3
iastore
aload 5
areturn
.end method

.method public getNeighborCoords(I)[I
.limit stack 5
.limit locals 10
aload_0
iload 1
invokevirtual Life/cartIdx(I)[I
astore 8
aload 8
iconst_0
iaload
istore 2
aload 8
iconst_1
iaload
istore 3
iload 2
aload_0
getfield Life/xMax I
if_icmplt loopTRUE19
iconst_0
goto loopFALSE19
loopTRUE19:
iconst_1
loopFALSE19:
ifne loop17
iconst_0
istore 6
iload 2
iconst_1
isub
istore 4
goto loop18
loop17:
iload 2
iconst_1
iadd
istore 6
aload_0
iload 2
iconst_0
invokevirtual Life/gt(II)Z
ifne loop20
aload_0
getfield Life/xMax I
istore 4
goto loop21
loop20:
iload 2
iconst_1
isub
istore 4
loop21:
loop18:
iload 3
aload_0
getfield Life/yMax I
if_icmplt loopTRUE24
iconst_0
goto loopFALSE24
loopTRUE24:
iconst_1
loopFALSE24:
ifne loop22
iconst_0
istore 7
iload 3
iconst_1
isub
istore 5
goto loop23
loop22:
iload 3
iconst_1
iadd
istore 7
aload_0
iload 3
iconst_0
invokevirtual Life/gt(II)Z
ifne loop25
aload_0
getfield Life/yMax I
istore 5
goto loop26
loop25:
iload 3
iconst_1
isub
istore 5
loop26:
loop23:
bipush 8
newarray int
astore 9
aload 9
iconst_0
aload_0
iload 2
iload 5
invokevirtual Life/trIdx(II)I
iastore
aload 9
iconst_1
aload_0
iload 4
iload 5
invokevirtual Life/trIdx(II)I
iastore
aload 9
iconst_2
aload_0
iload 4
iload 3
invokevirtual Life/trIdx(II)I
iastore
aload 9
iconst_3
aload_0
iload 4
iload 7
invokevirtual Life/trIdx(II)I
iastore
aload 9
iconst_4
aload_0
iload 2
iload 7
invokevirtual Life/trIdx(II)I
iastore
aload 9
iconst_5
aload_0
iload 6
iload 7
invokevirtual Life/trIdx(II)I
iastore
aload 9
bipush 6
aload_0
iload 6
iload 3
invokevirtual Life/trIdx(II)I
iastore
aload 9
bipush 7
aload_0
iload 6
iload 5
invokevirtual Life/trIdx(II)I
iastore
aload 9
areturn
.end method

.method public getLiveNeighborN(I)I
.limit stack 4
.limit locals 5
iconst_0
istore 4
aload_0
iload 1
invokevirtual Life/getNeighborCoords(I)[I
astore 2
iconst_0
istore 3
loop28:
iload 3
aload 2
arraylength
if_icmplt loopTRUE29
iconst_0
goto loopFALSE29
loopTRUE29:
iconst_1
loopFALSE29:
ifeq loop27
aload_0
aload_0
getfield Life/field1 [I
aload 2
iload 3
iaload
iaload
iconst_0
invokevirtual Life/ne(II)Z
ifne loop30
goto loop31
loop30:
iinc 4 1
loop31:
iinc 3 1
goto loop28
loop27:
iload 4
ireturn
.end method

.method public busyWait(I)Z
.limit stack 2
.limit locals 4
iload 1
aload_0
getfield Life/LOOPS_PER_MS I
imul
istore 3
iconst_0
istore 2
loop33:
iload 2
iload 3
if_icmplt loopTRUE34
iconst_0
goto loopFALSE34
loopTRUE34:
iconst_1
loopFALSE34:
ifeq loop32
iinc 2 1
goto loop33
loop32:
iconst_1
ireturn
.end method

.method public eq(II)Z
.limit stack 4
.limit locals 3
aload_0
iload 1
iload 2
invokevirtual Life/lt(II)Z
iconst_1
ixor
aload_0
iload 2
iload 1
invokevirtual Life/lt(II)Z
iconst_1
ixor
iand
ireturn
.end method

.method public ne(II)Z
.limit stack 3
.limit locals 3
aload_0
iload 1
iload 2
invokevirtual Life/eq(II)Z
iconst_1
ixor
ireturn
.end method

.method public lt(II)Z
.limit stack 2
.limit locals 3
iload 1
iload 2
if_icmplt loopTRUE35
iconst_0
goto loopFALSE35
loopTRUE35:
iconst_1
loopFALSE35:
ireturn
.end method

.method public le(II)Z
.limit stack 4
.limit locals 3
aload_0
iload 1
iload 2
invokevirtual Life/lt(II)Z
iconst_1
ixor
aload_0
iload 1
iload 2
invokevirtual Life/eq(II)Z
iconst_1
ixor
iand
iconst_1
ixor
ireturn
.end method

.method public gt(II)Z
.limit stack 3
.limit locals 3
aload_0
iload 1
iload 2
invokevirtual Life/le(II)Z
iconst_1
ixor
ireturn
.end method

.method public ge(II)Z
.limit stack 4
.limit locals 3
aload_0
iload 1
iload 2
invokevirtual Life/gt(II)Z
iconst_1
ixor
aload_0
iload 1
iload 2
invokevirtual Life/eq(II)Z
iconst_1
ixor
iand
iconst_1
ixor
ireturn
.end method

; standard initializer
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
