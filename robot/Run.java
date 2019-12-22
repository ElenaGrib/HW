package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        SonyHead head1 = new SonyHead(1000, 2000);
        SamsungHand hand1 = new SamsungHand(500, 1000);
        ToshibaLeg leg1 = new ToshibaLeg(200, 400);
        Robot robot1 = new Robot(head1, hand1, leg1);
        robot1.action();
        System.out.println();

        SamsungHead head2 = new SamsungHead(10000, 20000);
        ToshibaHand hand2 = new ToshibaHand(500, 1000);
        SonyLeg leg2 = new SonyLeg(200, 400);
        Robot robot2 = new Robot(head2, hand2, leg2);
        robot2.action();
        System.out.println();

        ToshibaHead head3 = new ToshibaHead(10, 20);
        SonyHand hand3 = new SonyHand(500, 1000);
        SamsungLeg leg3 = new SamsungLeg(200, 400);
        Robot robot3 = new Robot(head3, hand3, leg3);
        robot3.action();
        System.out.println();

        if (robot1.getCost() > robot2.getCost() && robot1.getCost() > robot3.getCost()) {
            System.out.println("Самый дорогой робот robot1");
        } else if (robot2.getCost() > robot1.getCost() && robot2.getCost() > robot3.getCost()) {
            System.out.println("Самый дорогой робот robot2");
        } else {
            System.out.println("Самый дорогой робот robot3");
        }

    }
}
