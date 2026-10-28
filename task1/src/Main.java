void main() {
    Calculator calculator1 = new Calculator(1);
    Calculator calculator2 = new Calculator(2, 2);
    Calculator calculator3 = new Calculator(3, 2, 2);

    IO.println(calculator1.linear());
    IO.println(calculator2.fractional());
    IO.println(calculator3.factorial());
}
