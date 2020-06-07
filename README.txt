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
**DEALING WITH SYNTACTIC ERRORS: (Describe how the syntactic error recovery of your tool does work. Does it exit after the first error?)
**SEMANTIC ANALYSIS: (Refer the semantic rules implemented by your tool.)
**INTERMEDIATE REPRESENTATIONS (IRs): (for example, when applicable, briefly describe the HLIR (high-level IR) and the LLIR (low-level IR) used, if your tool includes an LLIR with structure different from the HLIR)
**CODE GENERATION: (describe how the code generation of your tool works and identify the possible problems your tool has regarding code generation.)
**OVERVIEW: (refer the approach used in your tool, the main algorithms, the third-party tools and/or packages, etc.)
**TASK DISTRIBUTION: (Identify the set of tasks done by each member of the project. You can divide this by checkpoint it if helps)
**PROS: (Identify the most positive aspects of your tool)
**CONS: (Identify the most negative aspects of your tool)\