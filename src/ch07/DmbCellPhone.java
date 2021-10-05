package ch07;

import sun.security.pkcs11.Secmod;

public class DmbCellPhone extends CellPhone{
    int channel;

    /*public DmbCellPhone() {}
    public DmbCellPhone(int channel) {
        this.channel = channel;
     }
     */
    public DmbCellPhone(String model, String color, int channel) {
        //super(); //이경우가 아닌경우 > 부모가 기본생성자가 없을 때!!!
        this.model = model;
        this.color = color;
        this.channel = channel;
    }
/* this, super
   this.??? > 멤버필드, 멤버메소드 사용할때
   super.???
   this(); > 생성자 호출(나 자신의 생성자 호출)
   super(); > 생성자 호출(부모의 생성자 호출)
 */
@Override
void printInfo() {
    super.printInfo();
    System.out.printf("channel : %d\n", channel);

        }
    }

