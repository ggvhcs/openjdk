--- Getting Started ---

Some notes, from the VS Code Java world. Here is a guideline to help you get started to write Java code
in Visual Studio Code.

--- Today we can type java code for ArrayList ---
- unlike arrays, the size ca be change while the program id runing.
- no use always arrayList because is less efficient than array.

--- Folder Structure ---
 4096 Mar 14 17:50 bin
 4096 Mar 14 17:49 lib
  711 Mar 14 18:23 readme.txt
 4096 Mar 14 18:39 src
---

--- How to use ---
- must import in the progrm clas --- java.util.ArrayList; ---
- for create the object --- ArrayList<baseType> NameObject = new ArrayList<baseType>(); --
- for add items --- NameObject.add("Some base type") ---
- how many element have --- NameObject.size() ---
- replace some element, must have the index --- NameObject.set(index, "") ---

--- Compile and test ---
$ cd projectFolder/src
$ javac App.java //compile the file.
$ java App // execute Hello World program.

--- Customize the folder structure, open `.vscode/settings.json` and update the related settings. ---

--- bibliography ---
https://introcs.cs.princeton.edu/java/14array/