class Main {
	void foo(int i) {
		a(1);
		{
			a(2);
			a(i);
			a(4);
		}
		a(5);
	}

	void a(int x) {
	}

}
