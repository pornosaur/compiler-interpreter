void main() {
    integer a[5];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;

    integer test = 0;
    foreach(integer f : a) {
        test = f + 1;
    }
}