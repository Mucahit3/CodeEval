#include <iostream>
#include <fstream>
#include <sstream>
#include <cstring>
#include <string>

using namespace std;

int convert(string);

int main(int argc, char *argv[]) {

	ifstream stream(argv[1]);
	string line, tempLine;
	int numberCount = 0, majorNumber = 1, ourState;

	while (getline(stream, line)) {
		
		numberCount = 0;
		majorNumber = 1;
		tempLine = "";

		for (int i = 0; line[i] != '\0'; i++){
			if (line[i] == ',')
				numberCount++;
		}

		numberCount++;
		ourState = numberCount / 2;
		int *list = new int[numberCount];
		int j = 0;

		for (int i = 0; line[i] != '\0'; i++){
			
			if (line[i] == ',');
			else{
				tempLine += line[i];
				if (line[i + 1] == ','){
					list[j] = convert(tempLine);
					tempLine = "";
					j++;
				}
			}
		}

		for (int i = 0; i < numberCount; i++){
			for (int j = i + 1; j < numberCount; j++){

				if (list[i] == list[j])
					majorNumber++;
				
			}
			if (majorNumber >= ourState){
				cout << list[i] << endl;
				break;
			}
		}
	}

	stream.close();

	cout << endl;
	
}

int convert(string s){

	int number;
	stringstream convert(s);
	convert >> number;

	return number;
}