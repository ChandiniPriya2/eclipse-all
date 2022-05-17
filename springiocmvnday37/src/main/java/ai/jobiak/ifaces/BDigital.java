package ai.jobiak.ifaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BDigital {
Printable printable;
PackingInter packing;

public BDigital() {
	// TODO Auto-generated constructor stub
}
public BDigital(PackingInter packing) {
	// TODO Auto-generated constructor stub
	this.packing=packing;
}
public Printable getPrintable() {
	return printable;
}

public void setPrintable(Printable printable) {
	this.printable = printable;
}
public void publish() {
	printable .print();
	packing .doPacking();
}
 @PostConstruct
  public void doInit() {
	System.out.println("from init()....");
}
@PreDestroy
    public void doDestroy() {
	System.out.println("from destroy()....");
}
}
