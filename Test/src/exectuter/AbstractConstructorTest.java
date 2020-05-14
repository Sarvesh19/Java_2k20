package exectuter;

public class AbstractConstructorTest {
	public static void main(String args[]) {
		Server server = new Tomcat("Apache Tomcat");
		server.start();
		server.m1();
		
	}
}

abstract class Server {
	protected final String name;

	public Server(String name) {
		this.name = name;
	}

	public abstract boolean start();

	public void m1() {
		System.out.println("ec M1 server");
	}
}

abstract class WebServer extends Server {
	public String webServer;

	public WebServer(String name) {
		super(name);
		this.webServer = name;
	}

	@Override
	public void m1() {
		System.out.println("m1 of webserver");
	}

}

class Tomcat extends WebServer {
	public Tomcat(String name) {
		super(name);
	}
	
	@Override
	public void m1() {
		System.out.println("m1 of tomcat");
	}

	@Override
	public boolean start() {
		System.out.println(this.name + " started successfully"  );
		return true;
	}
}
