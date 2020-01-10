#!/bin/bash

#
# This directory contains an example of executing a program under the
# TEAMS aspect system. The "Advice" directory is not actually used -- the
# actual advice code is under ../src/example. The aspect definition is
# in the file "exampleAspect.t" (but the advice is elsewhere as it says above)
#
# -- You just need to compile the Hello.java program normally, 
#    as "javac Hello.java"

java -javaagent:../teams.jar=exampleAspect.t -cp ../teams.jar:../asm-5.0.3/lib/all/asm-all-5.0.3.jar:../antlr-runtime-4.2.2.jar:../lib/extension.jar:. Hello

#java -javaagent:../teams.jar=exampleAspect.t -cp ../teams.jar:../asm-5.0.3/lib/all/asm-all-5.0.3.jar:../antlr-runtime-4.2.2.jar:../lib/example.jar:../lib/extension.jar:. Hello
