package sub4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sub1.Apple;

/**
 * ��¥ : 2021/05/26
 * �̸� : ��¿�
 * ���� : �ڹ� �ݷ��� �� �ǽ��ϱ�
 */
public class MapTest {

	public static void main(String[] args) {
		
		// Map ����
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(101, "������");
		map1.put(102, "������");
		map1.put(103, "�庸��");
		map1.put(104, "������");
		map1.put(105, "�̼���");
		
		// Map ������ ����
		System.out.println("map1 �� ������ ���� : "+map1.size());
		
		// Map ������ ���
		System.out.println("map1 101�� ������ : "+map1.get(101));
		System.out.println("map1 103�� ������ : "+map1.get(103));
		System.out.println("map1 105�� ������ : "+map1.get(105));
		
		// Map ���� �ǽ�
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("�ѱ�", 3000));
		m1.put(102, new Apple("�߱�", 2000));
		m1.put(103, new Apple("�Ϻ�", 1000));		
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("�̱�", 3000));
		m2.put(202, new Apple("����", 2000));
		m2.put(203, new Apple("ȣ��", 1000));		
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("�±�", 3000));
		m3.put(302, new Apple("�븸", 2000));
		m3.put(303, new Apple("ȫ��", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		// �ѱ� ��� ���
		Map<Integer, Apple> map = list.get(0);
		Apple apple = map.get(101);
		apple.toString();
		
		// ȣ�� ��� ���
		list.get(1).get(203).toString();
		
		// �븸 ��� ���
		list.get(2).get(302).toString();

	}
	
}