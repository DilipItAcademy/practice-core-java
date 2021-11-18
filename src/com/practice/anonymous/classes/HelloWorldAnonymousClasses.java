package com.practice.anonymous.classes;

public class HelloWorldAnonymousClasses {

	//Nested Interface
	interface HelloWorld {
		public void greet();
		public void greetSomeone(String someone);
	}


	//Anonymous Class
	HelloWorld germanGreeting = new HelloWorld() {
		String name = "Dilip";

		@Override
		public void greet() {
			greetSomeone("German");
		}

		@Override
		public void greetSomeone(String someone) {
			name = someone;
			System.out.println("Hello, " + name);
		}
	};

	public void sayHello() {

		//Local Inner Class
		class EnglishGreeting implements HelloWorld {
			String name = "world";

			@Override
			public void greet() {
				greetSomeone("world");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		HelloWorld englishGreeting = new EnglishGreeting();

		//Anonymous Inner Class
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";

			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		//Anonymous Inner Class
		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";

			@Override
			public void greet() {
				greetSomeone("mundo");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " + name);
			}
		};
		englishGreeting.greet();
		frenchGreeting.greetSomeone("Fred");
		spanishGreeting.greet();
		germanGreeting.greet();
	}

	public static void main(String... args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}

}
