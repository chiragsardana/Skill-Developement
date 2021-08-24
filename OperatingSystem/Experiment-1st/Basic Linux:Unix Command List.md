1. pwd

pwd stands for Print Working Directory.

It prints the path of the working directory, starting from the root.

$PWD is an environment variable which stores the path of the current directory.
				|
				V
Environment Variables in Linux/Unix

Environment variables or ENVs basically define the behavior of the environment. They can affect the processes ongoing or the programs that are executed in the environment.  

Scope of an environment variable
Scope of any variable is the region from which it can be accessed or over which it is defined. An environment variable in Linux can have global or local scope.  

Global

A globally scoped ENV that is defined in a terminal can be accessed from anywhere in that particular environment which exists in the terminal. That means it can be used in all kind of scripts, programs or processes running in the environment bound by that terminal. 

Local

A locally scoped ENV that is defined in a terminal cannot be accessed by any program or process running in the terminal. It can only be accessed by the terminal( in which it was defined) itself. 

SYNTAX: $NAME

NOTE: Both local and global environment variables are accessed in the same way.  

How to display ENVs?

To display any ENV

Syntax: $ echo $NAME 

To display all the Linux ENVs

Syntax: 

$ printenv //displays all the global ENVs
or
$ set //display all the ENVs(global as well as local)
or
$ env //display all the global ENVs


How to set environment variables?

To set a global ENV  

Syntax:

$ export NAME=Value
or
$ set NAME=Value


To set a local ENV

SYNTAX:  

$ NAME=Value


To set user wide ENVs
These variable are set and configured in ~/.bashrc, ~/.bash_profile, ~/.bash_login, ~/.profile 
files according to the requirement. These variables can be accessed by a particular user and persist through power offs. 

Following steps can be followed to do so: 
Step 1: Open the terminal. 
Step 2: 
$ sudo vi ~/.bashrc 
Step 3:Enter password. 
Step 4:Add variable in the file opened.  
export NAME=Value
Step 5: Save and close the file. 
Step 6:  
$ source ~/.bashrc 




To set system wide ENVs
These variable are set and configured in /etc/environment, /etc/profile, /etc/profile.d/, /etc/bash.bashrc files according to the requirement.These variables can be accessed by any user and persist through power offs. 

Following steps can be followed to do so: 
Step 1: Open the terminal. 
Step 2: 

		$ sudo -H vi /etc/environment

Step 3:Enter password. 
Step 4:Add variable in the file opened.  
		
		NAME=Value

Step 5: Save and close the file. 
Step 6: Logout and Login again. 



How to unset environment variables?

Syntax:
		$ unset NAME
		or
		$ NAME=''



NOTE: To unset permanent ENVs, you need to re-edit the files and remove the lines that were added while defining them.  

Some commonly used ENVs in Linux/Unix

$USER: Gives current user's name.
$PATH: Gives search path for commands.
$PWD: Gives the path of present working directory.
$HOME: Gives path of home directory.
$HOSTNAME: Gives name of the host.
$LANG: Gives the default system language.
$EDITOR: Gives default file editor.
$UID: Gives user ID of current user.
$SHELL: Gives location of current user's shell program.



$PWD is an environment variable which stores the path of the current directory.

This command has two flags.

pwd -L: Prints the symbolic path.

pwd -P: Prints the actual path.

-->ls

ls is a Linux shell command that lists directory contents of files and directories.

ls -t : It sorts the file by modification time, showing the last edited file first. 

Display One File Per Line Using ls -1

Display All Information About Files/Directories Using ls -l


-rw-rw-r– 1 maverick maverick 1176 Feb 16 00:19 1.c

1st Character – File Type: First character specifies the type of the file.
In the example above the hyphen (-) in the 1st character indicates that this is a normal file. Following are the possible file type options in the 1st character of the ls -l output.
Field Explanation

– normal file
d : directory
s : socket file
l : link file
Field 1 – File Permissions: Next 9 character specifies the files permission. The every 3 characters specifies read, write, execute permissions for user(root), group and others respectively in order. Taking above example, -rw-rw-r– indicates read-write permission for user(root) , read permission for group, and no permission for others respectively. If all three permissions are given to user(root), group and others, the format looks like -rwxrwxrwx
Field 2 – Number of links: Second field specifies the number of links for that file. In this example, 1 indicates only one link to this file.
Field 3 – Owner: Third field specifies owner of the file. In this example, this file is owned by username ‘maverick’.
Field 4 – Group: Fourth field specifies the group of the file. In this example, this file belongs to ”maverick’ group.
Field 5 – Size: Fifth field specifies the size of file in bytes. In this example, ‘1176’ indicates the file size in bytes.
Field 6 – Last modified date and time: Sixth field specifies the date and time of the last modification of the file. In this example, ‘Feb 16 00:19’ specifies the last modification time of the file.
Field 7 – File name: The last field is the name of the file. In this example, the file name is 1.c.


Display File Size in Human Readable Format Using ls -lh

Display Directory Information Using ls -ld

Order Files Based on Last Modified Time Using ls -lt

Order Files Based on Last Modified Time (In Reverse Order) Using ls -ltr

 Display Hidden Files Using ls -a (or) ls -A

 ls -a : To show all the hidden files in the directory, use ‘-a option’. Hidden files in Unix starts with ‘.’ in its file name.It will show all the files including the ‘.’ (current directory) and ‘..’ (parent directory).

ls -A : To show the hidden files, but not the ‘.’ (current directory) and ‘..’ (parent directory).


Display Files Recursively Using ls -R

Display File Inode Number Using ls -i


The inode number refers to the physical file, the data stored in a particular location. A file also has a device number, and the combination of its inode number and device number is unique throughout all the file systems in the hierarchical file system.

Hide Control Characters Using ls -q

Display File UID and GID Using ls -n

Visual Classification of Files With Special Characters Using ls -F




-->mkdir


mkdir command in Linux allows the user to create directories (also referred to as folders in some operating systems ). This command can create multiple directories at once as well as set the permissions for the directories.

Syntax:
		mkdir [options...] [directories ...]

-v or --verbose: It displays a message for every directory created.


Syntax:

		mkdir -v [directories]

-p: A flag which enables the command to create parent directories as necessary. If the directories exist, no error is specified.

Syntax:

		mkdir -p [directories]


-m: This option is used to set the file modes, i.e. permissions, etc. for the created directories. The syntax of the mode is the same as the chmod command.


Syntax:

		mkdir -m a=rwx [directories]





-->touch

The touch command is a standard command used in UNIX/Linux operating system which is used to create, change and modify timestamps of a file. Basically, there are two different commands to create a file in the Linux system which is as follows:

touch command: It is used to create a file without any content. The file created using touch command is empty. This command can be used when the user doesn’t have data to store at the time of file creation.

Touch command Syntax to create a new file: You can create a single file at a time using touch command.

touch file_name


Touch command to create multiple files: Touch command can be used to create the multiple numbers of files at the same time. These files would be empty while creation.


touch File1_name File2_name File3_name 

touch -a: This command is used to change access time only. To change or update the last access or modification times of a file touch -a command is used.


touch -c : This command is used to check whether a file is created or not. If not created then don’t create it. This command avoids creating files.

touch -c fileName

<!-- Not Works -->
touch -c-d : This is used to update access and modification time.

touch -c-d fileName

touch -m : This is used to change the modification time only. It only updates last modification time.

touch -m fileName

touch -r : This command is used to use the timestamp of another file. Here Doc2 file is updated with the time stamp of File 1.

touch -r second_file_name first_file_name


touch -t : This is used to create a file using a specified time.

touch -t YYMMDDHHMM fileName

-->echo

echo command in linux is used to display line of text/string that are passed as an argument . This is a built in command that is mostly used in shell scripts and batch files to output status text to the screen or a file.

Syntax :

echo [option] [string]

Displaying a text/string :

echo [string]


Options of echo command

NOTE :- -e here enables the interpretation of backslash escapes

\b : it removes all the spaces in between the text

echo -e "Geeks \bfor \bGeeks"

\c : suppress trailing new line with backspace interpretor ‘-e‘ to continue without emitting new line.

echo -e "Geeks \cfor Geeks"

\n : this option creates new line from where it is used.

echo -e "Geeks \nfor \nGeeks"

\t : this option is used to create horizontal tab spaces.

echo -e "Geeks \tfor \tGeeks"

\r : carriage return with backspace interpretor ‘-e‘ to have specified carriage return in output.

echo -e "Geeks \rfor Geeks"

\v : this option is used to create vertical tab spaces.

echo -e "Geeks \vfor \vGeeks

\a : alert return with backspace interpretor ‘-e‘ to have sound alert.

echo -e "\aGeeks for Geeks

echo * : this command will print all files/folders, similar to ls command .

echo *

-n : this option is used to omit echoing trailing newline .

echo -n "Geeks for Geeks"



-->vim

Vim is an advanced and highly configurable text editor built to enable efficient text editing. Vim text editor is developed by Bram Moolenaar. It supports most file types and vim editor is also known as a programmer’s editor. We can use with its plugin based on our needs

vim


To open a file in vim editor just write the file name after the vim command in the terminal as follows:

vim filename.txt

Write into file 

In the previous step we have opened the file now, Let’s write some content in to write data we need to go in insert mode. To go into write mode type i.  As follows:



i

After going into insert mode you will see INSERT in the status bar. After that, we can write any data in it.

Save and Exit:

We have written the data into a file now the task is to save and close the file to do that first exit from insert mode by pressing the Esc key. To write a command first type semicolon  (  :  )  and then type the command wq!  And then hit ENTER.

:wq!


Exit without saving the file:

To exit from the file without saving the file just use the command q! As follows

:q!

Exiting Vim:

To exit without doing anything go into command mode by pressing the Esc key and type the following command.

:q

To exit from vim without saving changes type the following command in vim

:q!

To quit and save changes type the following command

:wq


Text Editing: Deletion

We provide x key in command mode to delete the character under the cursor. Move the cursor to the character which has to delete and press Esc key  and then press the x key




-->rm

rm stands for remove here. rm command is used to remove objects such as files, directories, symbolic links and so on from the file system like UNIX. To be more precise, rm removes references to objects from the filesystem, where those objects might have had multiple references (for example, a file with two different names). By default, it does not remove directories.

This command normally works silently and you should be very careful while running rm command because once you delete the files then you are not able to recover the contents of files and directories.

Syntax:

rm [OPTION]... FILE...

Removing one file at a time

rm a.txt

Removing more than one file at a time

-i (Interactive Deletion): Like in cp, the -i option makes the command ask the user for confirmation before removing each file, you have to press y for confirm deletion, any other key leaves the file un-deleted.


rm -i d.txt

-f (Force Deletion): rm prompts for confirmation removal if a file is write protected. The -f option overrides this minor protection and removes the file forcefully.

rm e.txt

rm -f e.txt


-r (Recursive Deletion): With -r(or -R) option rm command performs a tree-walk and will delete all the files and sub-directories recursively of the parent directory. At each stage it deletes everything it finds. Normally, rm wouldn’t delete the directories but when used with this option, it will delete.

rm *


Note: No output is produced by rm, since it typically only generates messages in the case of an error.


-->rmdir

rmdir command is used remove empty directories from the filesystem in Linux. The rmdir command removes each and every directory specified in the command line only if these directories are empty. So if the specified directory has some directories or files in it then this cannot be removed by rmdir command.

Syntax:

		rmdir [-p] [-v | –verbose] [–ignore-fail-on-non-empty] directories …

Options:

–help: It will print the general syntax of the command along with the various options that can be used with the rmdir command as well as give a brief description about each option.

rmdir -p: In this option each of the directory argument is treated as a pathname of which all components will be removed, if they are already empty, starting from the last component.

rmdir -v, –verbose: This option displays verbose information for every directory being processed.

rmdir –ignore-fail-on-non-empty: This option do not report a failure which occurs solely because a directory is non-empty. Normally, when rmdir is being instructed to remove a non-empty directory, it simply reports an error. This option consists of all those error messages.

rmdir –version: This option is used to display the version information and exit.

This will first remove the child directory and then remove the parent directory.

rmdir -p mydir/mydir1

Remove the directories mydir1, mydir2, and mydir3, if they are empty. If any of these directories are not empty, then an error message will be printed for that directory, and the other directories will be removed.

rmdir mydir1 mydir2 mydir3

Remove the directory mydir/mydir1 if it is empty. Then, remove directory mydir, if it is empty after mydir/mydir1 was removed.

rmdir mydir/mydir1 mydir

-->mv

mv stands for move. mv is used to move one or more files or directories from one place to another in a file system like UNIX. It has two distinct functions: 
(i) It renames a file or folder. 
(ii) It moves a group of files to a different directory. 
No additional space is consumed on a disk during renaming. This command normally works silently means no prompt for confirmation. 

Syntax:
		
		mv [Option] source destination


If the destination file doesn’t exist, it will be created. In the above command mv simply replaces the source filename in the directory with the destination filename(new name). If the destination file exist, then it will be overwrite and the source file will be deleted. By default, mv doesn’t prompt for overwriting the existing file, So be careful !! 


Options: 

-i (Interactive): Like in cp, the -i option makes the command ask the user for confirmation before moving a file that would overwrite an existing file, you have to press y for confirm moving, any other key leaves the file as it is. This option doesn’t work if the file doesn’t exist, it simply rename it or move it to new location. 

mv -i geek.txt b.txt

-f (Force): mv prompts for confirmation overwriting the destination file if a file is write-protected. The -f option overrides this minor protection and overwrites the destination file forcefully and deletes the source file. 

mv geek.txt b.txt

 -n (no-clobber): With -n option, mv prevent an existing file from being overwritten. 
In the following example the effect is for nothing to happen as a file would be overwritten. 

mv -n geek.txt b.txt

-->cp

cp stands for copy. This command is used to copy files or group of files or directory. It creates an exact image of a file on a disk with different file name. cp command require at least two filenames in its arguments.

Syntax:

		cp [OPTION] Source Destination
		cp [OPTION] Source Directory
		cp [OPTION] Source-1 Source-2 Source-3 Source-n Directory

		First and second syntax is used to copy Source file to Destination file or Directory.
		Third syntax is used to copy multiple Sources(files) to Directory.

cp command works on three principal modes of operation and these operations depend upon number and type of arguments passed in cp command :

Two file names : If the command contains two file names, then it copy the contents of 1st file to the 2nd file. If the 2nd file doesn’t exist, then first it creates one and content is copied to it. But if it existed then it is simply overwritten without any warning. So be careful when you choose destination file name.

cp Src_file Dest_file

cp a.txt b.txt

One or more arguments : If the command has one or more arguments, specifying file names and following those arguments, an argument specifying directory name then this command copies each source file to the destination directory with the same name, created if not existed but if already existed then it will be overwritten, so be careful !!.

cp a.txt b.txt new

Note: For this case last argument must be a directory name. For the above command to work, Dest_directory must exist because cp command won’t create it.

Two directory names : If the command contains two directory names, cp copies all files of the source directory to the destination directory, creating any files or directories needed. This mode of operation requires an additional option, typically R, to indicate the recursive copying of directories.


cp -R Src_directory Dest_directory

In the above command, cp behavior depend upon whether Dest_directory is exist or not. If the Dest_directory doesn’t exist, cp creates it and copies content of Src_directory recursively as it is. But if Dest_directory exists then copy of Src_directory becomes sub-directory under Dest_directory.


Options:

There are many options of cp command, here we will discuss some of the useful options:
Suppose a directory named geeksforgeeks contains two files having some content named as a.txt and b.txt. This scenario is useful in understanding the following options.

-i(interactive): i stands for Interactive copying. With this option system first warns the user before overwriting the destination file. cp prompts for a response, if you press y then it overwrites the file and with any other option leave it uncopied.

cp -i a.txt b.txt

-f(force): If the system is unable to open destination file for writing operation because the user doesn’t have writing permission for this file then by using -f option with cp command, destination file is deleted first and then copying of content is done from source to destination file.

cp -f a.txt b.txt

-r or -R: Copying directory structure. With this option cp command shows its recursive behavior by copying the entire directory structure recursively.

cp -r geeksforgeeks gfg


-p(preserve): With -p option cp preserves the following characteristics of each source file in the corresponding destination file: the time of the last data modification and the time of the last access, the ownership (only if it has permissions to do this), and the file permission-bits.

ls -l a.txt

cp -p a.txt c.txt

ls -l c.txt


-->chmod

In Unix-like operating systems, the chmod command is used to change the access mode of a file.
The name is an abbreviation of change mode.

Syntax:

		chmod [reference][operator][mode] file... 




The references are used to distinguish the users to whom the permissions apply i.e. they are list of letters that specifies whom to give permissions. The references are represented by one or more of the following letters:



Reference   Class     Description
u          owner      file's owner

g          group      users who are members of
                      the file's group

o          others     users who are neither the
                      file's owner nor members of 
                      the file's group

a          all       All three of the above, same as ugo

The operator is used to specify how the modes of a file should be adjusted. The following operators are accepted:

Operator  Description
+         Adds the specified modes to the
          specified classes

-         Removes the specified modes from 
          the specified classes

=         The modes specified are to be made
          the exact modes for the specified 
          classes



Note : Putting blank space(s) around operator would make the command fail.

The modes indicate which permissions are to be granted or removed from the specified classes. There are three basic modes which correspond to the basic permissions:

r       Permission to read the file.
w       Permission to write (or delete) the file.
x       Permission to execute the file, or, in
        the case of a directory, search it.


BEFORE: drwxrwxr-x  mik   mik   EXAM

COMMAND: chmod u=rw EXAM

AFTER: drw-rwxr-x   mik  mik    EXAM



-->man


man command in Linux is used to display the user manual of any command that we can run on the terminal. It provides a detailed view of the command which includes NAME, SYNOPSIS, DESCRIPTION, OPTIONS, EXIT STATUS, RETURN VALUES, ERRORS, FILES, VERSIONS, EXAMPLES, AUTHORS and SEE ALSO.

Every manual is divided into the following sections:

Executable programs or shell commands
System calls (functions provided by the kernel)
Library calls (functions within program libraries
Games
Special files (usually found in /dev)
File formats and conventions eg /etc/passwd
Miscellaneous (including macro packages and conventions), e.g. groff(7)
System administration commands (usually only for root)
Kernel routines [Non standard]


Syntax 

		man [OPTION]... [COMMAND NAME]...


No Option: It displays the whole manual of the command.

man printf

Section-num: Since a manual is divided into multiple sections so this option is used to display only a specific section of a manual.

man 2 intro


-f option: One may not be able to remember the sections in which a command is present. So this option gives the section in which the given command is present.

man -f ls

-a option: This option helps us to display all the available intro manual pages in succession.


man -a intro



-k option: This option searches the given command as a regular expression in all the manuals and it returns the manual pages with the section number in which it is found.

man -k cd

-w option: This option returns the location in which the manual page of a given command is present.

man -w ls

-->cd commands

cd command in linux known as change directory command. It is used to change current working directory.

Different functionalities of cd command :

cd /: this command is used to change directory to the root directory, The root directory is the first directory in your filesystem hierarchy.

cd dir_1/dir_2/dir_3: This command is used to move inside a directory from a directory

cd ~ : this command is used to change directory to the home directory.

cd : this commad also work same as cd ~ command.

cd .. : this command is used to move to the parent directory of current directory, or the directory one level up from the current directory. “..” represents parent directory.

cd “dir name”: This command is used to navigate to a directory with white spaces.Instead of using double quotes we can use single quotes then also this command will work.


-->cat

Cat(concatenate) command is very frequently used in Linux. It reads data from the file and gives their content as output. It helps us to create, view, concatenate files. So let us see some frequently used cat commands. 

To view a single file 

Command: cat filename

To view multiple files 

cat file1 file2

This will show the content of file1 and file2.

To view contents of a file preceding with line numbers.

cat -n filename

Create a file 

cat >newfile

Copy the contents of one file to another file. 

cat [filename-whose-contents-is-to-be-copied] > [destination-filename]

Cat command can suppress repeated empty lines in output 

cat -s geeks.txt

Cat command can append the contents of one file to the end of another file

cat file1 >> file2

Cat command can display content in reverse order using tac command. 

tac filename

Cat command can highlight the end of line. 

cat -E "filename"


Cat command if the file has a lot of content and can’t fit in the terminal. 

cat "filename" | more


Cat command to merge the contents of multiple files. 

cat "filename1" "filename2" "filename3" > "merged_filename"


Cat command to display the content of all text files in the folder. 

cat * .txt

Cat command to write in an already existing file. 


cat >> geeks.txt
The newly added text.


-->grep


The grep filter searches a file for a particular pattern of characters, and displays all lines that contain that pattern. The pattern that is searched in the file is referred to as the regular expression (grep stands for globally search for regular expression and print out). 



Syntax: 

			grep [options] pattern [files]


Options Description
-c : This prints only a count of the lines that match a pattern
-h : Display the matched lines, but do not display the filenames.
-i : Ignores, case for matching
-l : Displays list of a filenames only.
-n : Display the matched lines and their line numbers.
-v : This prints out all the lines that do not matches the pattern
-e exp : Specifies expression with this option. Can use multiple times.
-f file : Takes patterns from file, one per line.
-E : Treats pattern as an extended regular expression (ERE)
-w : Match whole word
-o : Print only the matched parts of a matching line,
 with each such part on a separate output line.

-A n : Prints searched line and nlines after the result.
-B n : Prints searched line and n line before the result.
-C n : Prints searched line and n lines after before the result.

Case insensitive search :

The -i option enables to search for a string case insensitively in the give file. It matches the words like “UNIX”, “Unix”, “unix”. 

grep -i "UNix" geekfile.txt

Displaying the count of number of matches 

grep -c "unix" geekfile.txt


Display the file names that matches the pattern

grep -l "unix" *


Checking for the whole words in a file : By default, grep matches the given string/pattern even if it found as a substring in a file. The -w option to grep makes it match only the whole words. 


grep -w "unix" geekfile.txt


Displaying only the matched pattern : By default, grep displays the entire line which has the matched string. We can make the grep to display only the matched string by using the -o option. 

grep -o "unix" geekfile.txt


Show line number while displaying the output using grep -n

grep -n "unix" geekfile.txt

Inverting the pattern match 

grep -v "unix" geekfile.txt

Matching the lines that start with a string

grep "^unix" geekfile.txt


Matching the lines that end with a string


grep "os$" geekfile.txt




Specifies expression with -e option. Can use multiple times 

grep –e "Agarwal" –e "Aggarwal" –e "Agrawal" geekfile.txt


-f file option Takes patterns from file, one per line. 

grep –f pattern.txt  geekfile.txt


Print n specific lines from a file:  -A prints the searched line and n lines after the result, -B prints the searched line and n lines before the result, and -C prints the searched line and n lines after and before the result. 

grep -A1 learn geekfile.txt
	
-->sort

SORT command is used to sort a file, arranging the records in a particular order. By default, the sort command sorts file assuming the contents are ASCII. Using options in sort command, it can also be used to sort numerically.

SORT command sorts the contents of a text file, line by line.
sort is a standard command line program that prints the lines of its input or concatenation of all files listed in its argument list in sorted order.

The sort command is a command line utility for sorting lines of text files. It supports sorting alphabetically, in reverse order, by number, by month and can also remove duplicates.

The sort command can also sort by items not at the beginning of the line, ignore case sensitivity and return whether a file is sorted or not. Sorting is done based on one or more sort keys extracted from each line of input.

By default, the entire input is taken as sort key. Blank space is the default field separator.
The sort command follows these features as stated below:

Lines starting with a number will appear before lines starting with a letter.
Lines starting with a letter that appears earlier in the alphabet will appear before lines starting with a letter that appears later in the alphabet.
Lines starting with a lowercase letter will appear before lines starting with the same letter in uppercase.

Sorting a file : Now use the sort command

sort filename.txt

Options with sort function

-o Option : Unix also provides us with special facilities like if you want to write the output to a new file, output.txt, redirects the output like this or you can also use the built-in sort option -o, which allows you to specify an output file.
Using the -o option is functionally the same as redirecting the output to a file.
Note: Neither one has an advantage over the other.
Example:The input file is the same as mentioned above.

$ sort file.txt > output.txt 
$ sort -o output.txt file.txt
$ cat output.txt



-r Option: Sorting In Reverse Order : You can perform a reverse-order sort using the -r flag. the -r flag is an option of the sort command which sorts the input file in reverse order i.e. descending order by default.


sort -r inputfile.txt


-n Option : To sort a file numerically used –n option. -n option is also predefined in unix as the above options are. This option is used to sort the file with numeric data present inside.

sort -n filename.txt

-nr option : To sort a file with numeric data in reverse order we can use the combination of two options as stated below.


sort -nr filename.txt


-k Option : Unix provides the feature of sorting a table on the basis of any column number by using -k option.


sort -k 2n employee.txt

-c option : This option is used to check if the file given is already sorted or not & checks if a file is already sorted pass the -c option to sort. This will write to standard output if there are lines that are out of order.The sort tool can be used to understand if this file is sorted and which lines are out of order

sort -c filename.txt

-u option : To sort and remove duplicates pass the -u option to sort. This will write a sorted list to standard output and remove duplicates.

sort -u filename.txt


-M Option : To sort by month pass the -M option to sort. This will write a sorted list to standard output ordered by month name.


sort -M filename.txt


Application and uses of sort command

It can sort any type of file be it table file text file numeric file and so on.
Sorting can be directly implemented from one file to another without the present work being hampered.
Sorting of table files on the basis of column has been made way simpler and easier.
So many option are available for sorting in all possible ways.
The most beneficial use is that a particular data file can be used many times as no change is made in the input file provided.
Original data is always safe and not hampered.





