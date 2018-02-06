package com.mxl.enumtest;

/**
 * ö���÷����
 * 
 * @author Mao
 * 
 */
public class TestEnum {
	/**
	 * ��ͨö��
	 * 
	 * @author Mao
	 * 
	 */
	public enum ColorEnum {
		red, green, yellow, blue;
	}

	/**
	 * ö������ͨ����һ������������Ժͷ���������Ϊ����Ӿ�̬�ͷǾ�̬�����Ի򷽷�
	 * 
	 * @author Mao
	 * 
	 */
	public enum SeasonEnum {
		// ע��ö��д����ǰ�棬����������
		spring, summer, autumn, winter;

		private final static String position = "test";

		public static SeasonEnum getSeason() {
			if ("test".equals(position))
				return spring;
			else
				return winter;
		}
	}

	/**
	 * �Ա�
	 * 
	 * ʵ�ִ��й�������ö��
	 * 
	 * @author Mao
	 * 
	 */
	public enum Gender {
		// ͨ�����Ÿ�ֵ,���ұ������һ���ι�������һ�����Ը�����������������
		// ��ֵ���붼��ֵ�򶼲���ֵ������һ���ָ�ֵһ���ֲ���ֵ���������ֵ����д����������ֵ����Ҳ����
		MAN("MAN"), WOMEN("WOMEN");

		private final String value;

		// ������Ĭ��Ҳֻ����private, �Ӷ���֤���캯��ֻ�����ڲ�ʹ��
		Gender(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
	}

	/**
	 * ����״̬
	 * 
	 * ʵ�ִ��г��󷽷���ö��
	 * 
	 * @author Mao
	 * 
	 */
	public enum OrderState {
		/** ��ȡ�� */
		CANCEL {
			public String getName() {
				return "��ȡ��";
			}
		},
		/** ����� */
		WAITCONFIRM {
			public String getName() {
				return "�����";
			}
		},
		/** �ȴ����� */
		WAITPAYMENT {
			public String getName() {
				return "�ȴ�����";
			}
		},
		/** ������� */
		ADMEASUREPRODUCT {
			public String getName() {
				return "�������";
			}
		},
		/** �ȴ����� */
		WAITDELIVER {
			public String getName() {
				return "�ȴ�����";
			}
		},
		/** �ѷ��� */
		DELIVERED {
			public String getName() {
				return "�ѷ���";
			}
		},
		/** ���ջ� */
		RECEIVED {
			public String getName() {
				return "���ջ�";
			}
		};

		public abstract String getName();
	}

	public static void main(String[] args) {
		// ö����һ�����ͣ����ڶ�������������Ʊ����ĸ�ֵ����ֵʱͨ����ö����.ֵ��ȡ��ö���е�ֵ
		ColorEnum colorEnum = ColorEnum.blue;
		switch (colorEnum) {
		case red:
			System.out.println("color is red");
			break;
		case green:
			System.out.println("color is green");
			break;
		case yellow:
			System.out.println("color is yellow");
			break;
		case blue:
			System.out.println("color is blue");
			break;
		}

		// ����ö��
		System.out.println("����ColorEnumö���е�ֵ");
		for (ColorEnum color : ColorEnum.values()) {
			System.out.println(color);
		}

		// ��ȡö�ٵĸ���
		System.out.println("ColorEnumö���е�ֵ��" + ColorEnum.values().length + "��");

		// ��ȡö�ٵ�����λ�ã�Ĭ�ϴ�0��ʼ
		System.out.println(ColorEnum.red.ordinal());// 0
		System.out.println(ColorEnum.green.ordinal());// 1
		System.out.println(ColorEnum.yellow.ordinal());// 2
		System.out.println(ColorEnum.blue.ordinal());// 3

		// ö��Ĭ��ʵ����java.lang.Comparable�ӿ�
		System.out.println(ColorEnum.red.compareTo(ColorEnum.green));// -1

		// --------------------------
		System.out.println("===========");
		System.out.println("����Ϊ" + SeasonEnum.getSeason());

		// --------------
		System.out.println("===========");
		for (Gender gender : Gender.values()) {
			System.out.println(gender.value);
		}

		// --------------
		System.out.println("===========");
		for (OrderState order : OrderState.values()) {
			System.out.println(order.getName());
		}
	}

}