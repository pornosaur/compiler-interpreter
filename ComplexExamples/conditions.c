
void main() {
	integer a = 4;
	integer b = 3;
	if(a < b){
		a = 15;
	}else{
		if(a > b){
			a = 10;
		}else{
			a = 5;
		}
	}
	
	switch(a) {
	  case 15: a = 9;
       break;
      case 10: a = 6;
       break;
      case 5: a = 3;
      break;
	}
}

