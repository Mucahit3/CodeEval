#include <iostream>
#include <fstream>
#include <sstream>
#include <cstring>
#include <string>

using namespace std;

int Size(string);
int convert(string);

int main(int argc, char *argv[]) {

	ifstream stream(argv[1]);
	string line, realLine, tempLine;
	int maxSize;

	while (getline(stream, line)) {

		maxSize = 0;
		realLine = "";
		tempLine = "";

		for (int i = 0; line[i] != '\0'; i++){

			if (line[i] == ' ' || line[i + 1] == '\0'){
				if (Size(tempLine) > maxSize){
					realLine = "";
					maxSize = Size(tempLine);
					realLine = tempLine;
					tempLine = "";
				}
				tempLine = "";
			}
			else{
				tempLine += line[i];
			}
		}
		cout << realLine << endl;
	}

	stream.close();

	cout << endl;

}

int Size(string str){

	int i;
	for (i = 0; str[i] != '\0'; i++);
	
	return i;
}

int convert(string s){

	int number;
	stringstream convert(s);
	convert >> number;

	return number;
}