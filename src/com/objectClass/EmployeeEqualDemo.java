package com.objectClass;

public class EmployeeEqualDemo {
	
	private String name;
	private int empno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public EmployeeEqualDemo(String name, int empno) {
		//super();
		this.name = name;
		this.empno = empno;
	}
	public boolean equals(Object o) {
		//to make more equals method more efficiant first if condition
		
		if (this == o) {
            return true;
        }
		if(o!= null && o instanceof EmployeeEqualDemo) {
		int eno =((EmployeeEqualDemo)o).empno;
		String ename=((EmployeeEqualDemo)o).name;
		if(ename.equals(this.name) && eno== this.empno) {
			return true;
			
		}else {
			return false;
		}
		
		}
		return false;
		
	}
	public static void main(String[] args) {
		EmployeeEqualDemo demo= new EmployeeEqualDemo("durga",new Integer(101));
		EmployeeEqualDemo demo1= new EmployeeEqualDemo("shiv",new Integer(102));
		EmployeeEqualDemo demo2= new EmployeeEqualDemo("shiv",new Integer(102));
		EmployeeEqualDemo demo4= new EmployeeEqualDemo("shiv",new Integer(105));
		EmployeeEqualDemo demo3=demo1;
		
		System.out.println(demo1.equals(demo2));
		System.out.println(demo1.equals(demo3));
		System.out.println(demo.equals(demo2));
		System.out.println(demo1.equals(demo4));
		
	}
	
	
	
	

}
