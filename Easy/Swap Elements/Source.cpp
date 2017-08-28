#include <iostream>
#include <fstream>
#include <sstream>
#include <cstring>
#include <string>

using namespace std;

int Size(string);
int convert(string);
void swap(int *&, int *);

int main(int argc, char *argv[]) {

	ifstream stream("document.txt");
	string line, numberLine, digitLine;
	int *numbers, j = 0, i, digits[2];

	while (getline(stream, line)) {
		
		numbers = new int[Size(line)];
		numberLine = "";

		for (i = 0; line[i] != '\0'; i++){
			if (line[i] != ' ')
				numberLine += line[i];
			else{
				numbers[j] = convert(numberLine);
				numberLine = "";
				j++;
			}
		}

		j = 0;
		i += 2;
		numberLine = "";
		digitLine = "";

		for (; line[i] != '\0'; i ++){
			
			if (line[i] != '-' && line[i] != ',' && line[i] != ' '){
				digitLine = line[i];
				digits[j] = convert(digitLine);
				j++;
			}
			if (line[i] == ' ' && line[i + 1] == '\0'){
				swap(numbers, digits);
				j = 0;
			}
		}

		delete numbers;
	}

	
	stream.close();

	cout << endl;

}

void swap(int *&array, int *digits){

	int temp;
	
	temp = array[digits[0]];
	array[digits[0]] = array[digits[1]];
	array[digits[1]] = temp;

}

int Size(string str){

	int count = 0;
	for (int i = 0; str[i] != ':'; i++){
		if (str[i] == ' ')
			count++;
	}
	return count;
}

int convert(string s){

	int number;
	stringstream convert(s);
	convert >> number;

	return number;
}