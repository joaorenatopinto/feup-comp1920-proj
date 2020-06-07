**PROJECT TITLE: Java-- Compiler
**GROUP: 7F
(Names, numbers, self assessment, and contribution of the members of the group to the project according to:)
NAME1: Afonso Mendonça, NR1: 201706708, CONTRIBUTION1: 25%
NAME2: Gonçalo Pereira, NR2: 201705971, CONTRIBUTION2: 20%
NAME3: João Pinto, NR3: 201705547, CONTRIBUTION3: 27%
NAME4: Tiago Verdade, Nr4: 201704003, CONTRIBUTION4: 28%
...

GLOBAL Grade of the project: 18
** SUMMARY: Our tool does what the professors told us the tool should do.
** EXECUTE: First, we need to run "Gradle build". This will compile the files and copy the .JAR file to the root of the project. The .JAR file will have the same name as the repository.
After that, we run "Java -jar comp2020-7f.jar <FILE.jmm>", where the last argument is the .jmm file we intend to compile into Java ByteCodes.
This latter step being done, our tool's job is completed. However, if we want to test the created Java ByteCode files, "Java -jar jasmin.jar <FILE.j>" should be run in order to use the Jasmin tool to convert the Java ByteCode file into Java's .class files.
Finally, we can do "Java <FILE>" and see the output.
**DEALING WITH SYNTACTIC ERRORS: It shows and recovers from the first 10 erros. After that, the process is terminated.
**SEMANTIC ANALYSIS: every semantic rule was implemented. 
**INTERMEDIATE REPRESENTATIONS (IRs): (for example, when applicable, briefly describe the HLIR (high-level IR) and the LLIR (low-level IR) used, if your tool includes an LLIR with structure different from the HLIR)
**CODE GENERATION: code generation works recursively by calling the "CodeGenerator" class and giving it the root of the tree. From then on each node's "generateCode()" method is called, returning the respective code for the node. Each returned code is added onto a string that will eventually add up to the final Java ByteCode file.
**OVERVIEW: (refer the approach used in your tool, the main algorithms, the third-party tools and/or packages, etc.)
**TASK DISTRIBUTION: Every team member worked pretty uniformly throughout the project without being assigned any specific task.
**PROS: 
	- It works.
**CONS: (Identify the most negative aspects of your tool)
	- Doesn't check if given variable that is given a value to inside an if/else might eventually end up not being assigned a value to depending on the if clause condidition.\