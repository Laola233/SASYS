package sasys.Api;

import xyz.mofangserver.sasys.main.*;
import xyz.mofangserver.sasys.fuctions.*;
import xyz.mofangserver.sasys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @since 0.1
 * <br> SASYS(StudentAdminSystem)��API
 * @serial SASYS(StudentAdminSystem)
 * <br> ʹ�÷���:������ҪAPI���м̳и���
 */
public abstract class Apis {
	protected double apiversion = 0.1;

	/**
	 * <code>��ȡ�������ѧ����Ϣ</code>
	 * @return Student ѧ����Ϣ
	 * @param No ѧ�����
	 */
	public final Student getthisStudentInfoApi(int No) {
		return Main.stuArr[No];
	}

	/**
	 * <code>��ȡ������Ľ�ʦ��Ϣ</code>
	 * @return Teacher ��ʦ��Ϣ
	 * @param No ��ʦ���
	 */
	public final Teacher getthisTeacherInfoApi(int No) {
		return Main.teaArr[No];
	}

	/**
	 * <code>��ȡ������Ĺ�����Ա��Ϣ</code>
	 * @return Administrators ������Ա��Ϣ
	 * @param No ������Ա���
	 */
	public final Administrators getthisAdministratorsInfoApi(int No) {
		return Main.admArr[No];
	}

	/**
	 * <code>��ȡ���������ѧ����Ϣ</code>
	 * @return Student ѧ����Ϣ
	 * @param No ѧ����� 
	 * @param arr ���������ѧ������
	 */
	public final Student getotherStudentInfoApi(int No, Student[] arr) {
		return arr[No];
	}

	/**
	 * <code>��ȡ����������Ľ�ʦ��Ϣ</code>
	 * @return Teacher ��ʦ��Ϣ
	 * @param No ��ʦ���
	 * @param arr ��������Ľ�ʦ����
	 */
	public final Teacher getotherTeacherInfoApi(int No, Teacher[] arr) {
		return arr[No];
	}

	/**
	 * <code>��ȡ����������Ĺ�����Ա��Ϣ</code>
	 * @return Administrators ������Ա��Ϣ
	 * @param No ������Ա���
	 * @param arr ��������Ĺ�����Ա����
	 */
	public final Administrators getotherAdministratorsInfoApi(int No, Administrators[] arr) {
		return arr[No];
	}

	/**
	 * <code> ��ȡ��ǰʱ�� </code>
	 * @deprecated
	 * @return String ʱ���ַ���
	 */
	public final String getTime() {
		return GetNowTime.Date();
	}

	/**
	 * <code> ��ȡĿ������ API </code> 
	 * @return String Ŀ������
	 * @param No Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Student[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ��ȡĿ������ API </code> 
	 * @return String Ŀ������
	 * @param No Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Teacher[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ��ȡĿ������ API </code> 
	 * @return String Ŀ������
	 * @param No Ŀ����
	 * @param arr ���������Ŀ�����������
	 */
	public final String getTargetType(int No, Administrators[] arr) {
		return arr[No].getType();
	}

	/**
	 * <code> ����ѧ������(����ר��) </code>
	 * @return Student[] ѧ������
	 * @param amount �����±���
	 */
	public final Student[] returnStudentArr(int amount) {
		Student[] arr = new Student[amount];
		return arr;
	}

	/**
	 * <code> ���ý�ʦ����(����ר��) </code>
	 * @return Teacher[] ��ʦ����
	 * @param amount �����±���
	 */
	public final Teacher[] returnTeacherArr(int amount) {
		Teacher[] arr = new Teacher[amount];
		return arr;
	}

	/**
	 * <code> ���ù�����Ա����(����ר��) </code>
	 * @return Administrators[] ������Ա����
	 * @param amount �����±���
	 */
	public final Administrators[] returnAdministratorsArr(int amount) {
		Administrators[] arr = new Administrators[amount];
		return arr;
	}

	/**
	 * <code> ȷ��ʹ��API </code>
	 * <br><strong> ʵ�ִ˷�������ʹ�ñ�API </strong>
	 * <br><strong> ��������: void </strong>
	 * <br><span> ����:void submits() {} </span>
	 */
	abstract void submits();
}
