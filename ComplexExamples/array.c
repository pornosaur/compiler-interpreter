integer countArray(integer b){

	return b[0];
}

void main() {
	integer a = 4;
	integer b[a];
	integer c = 5;
	integer i = 0;
	
	while(i < a){
		b[i] = c;
		i = i + 1;
	}
	
	a = countArray(b);
}

