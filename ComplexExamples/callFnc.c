integer fnc2(integer a){
	return a * a;
}

integer fnc1(integer a, integer b){
	integer c = a + fnc2(b);
	return c;
}



void main() {
	integer a = 4;
	integer b = 5;
	a = fnc1(a, b);
}

