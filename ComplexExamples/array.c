integer countArray(integer b[], integer size){
	integer tmp;
	for(integer i = 0; i < size; i = i + 1){
		tmp = tmp + b[i];
	}
	return tmp;
}

void main() {
	integer a = 4;
	integer b[a];
	integer c = 2;
	integer i = 0;
	
	while(i < a){
		b[i] = c;
		i = i + 1;
	}
	
	a = countArray(b, a);
	
	foreach(integer tmp : b){
		a = tmp + a;	
	}
}