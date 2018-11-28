/**
 * 汇付天下
 */
package Util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: 该类的功能描述
 * @author xiaoliang.fan
 * @date: 2018年11月26日 下午7:54:30
 * @version: v1.0.0
 */
public class ObjectUtil {
	
	public static void copy(Object source, Object target) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class sourceClass = source.getClass();//得到对象的Class
		Class targetClass = target.getClass();//得到对象的Class
		
		Field[] sourceFields = sourceClass.getDeclaredFields();//得到Class对象的所有属性
		Field[] targetFields = targetClass.getDeclaredFields();//得到Class对象的所有属性
		
		for(Field sourceField : sourceFields){
			String name = sourceField.getName();//属性名
			Class type = sourceField.getType();//属性类型
			
			String methodName = name.substring(0, 1).toUpperCase() + name.substring(1);
			
			Method getMethod = sourceClass.getMethod("get" + methodName);//得到属性对应get方法
			
			Object value = getMethod.invoke(source);//执行源对象的get方法得到属性值
			
			for(Field targetField : targetFields){
				String targetName = targetField.getName();//目标对象的属性名
				
				if(targetName.equals(name)){
					Method setMethod = targetClass.getMethod("set" + methodName, type);//属性对应的set方法
					
					setMethod.invoke(target, value);//执行目标对象的set方法
					
					//加一个break，如果相等，可以跳出当前循环，查找一下一个字段。
					break;
				}
			}
		}
	}
	
	public static boolean compareAndAssign(Object source, Object target) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		boolean isEqual = true;
		
		Class sourceClass = source.getClass();//得到source对象的Class
		Class targetClass = target.getClass();//得到target对象的Class
		
		Field[] sourceFields = sourceClass.getDeclaredFields();//得到source Class对象的所有属性
		Field[] targetFields = targetClass.getDeclaredFields();//得到target Class对象的所有属性
		
		for(Field sourceField : sourceFields) {
			
			String sourceName = sourceField.getName();//source 属性名
			Class sourceType = sourceField.getType();//source 属性类型
			
			String sourceMethodName = sourceName.substring(0, 1).toUpperCase() + sourceName.substring(1);
			
			Method sourceGetMethod = sourceClass.getMethod("get" + sourceMethodName);//得到source 属性对应get方法
			
			Object sourceValue = sourceGetMethod.invoke(source);//执行source对象的get方法得到属性值
			
			for(Field targetField : targetFields) {
				String targetName = targetField.getName();//target对象的属性名
				
				//如果traget对象的属性名和source对象属性名相等，进一步判断属性值是否相等。
				if(targetName.equals(sourceName)) {
					Method targetGetMethod = targetClass.getMethod("get" + sourceMethodName);//target属性对应的get方法
					Object targetValue = targetGetMethod.invoke(target);
					
					if (sourceValue != null && (!sourceValue.toString().isEmpty()) && targetValue != null && !sourceValue.equals(targetValue)) {
						isEqual = false;
						Method targetSetMethod = targetClass.getMethod("set" + sourceMethodName, sourceType);//target属性对应的set方法
						targetSetMethod.invoke(target, sourceValue);	//source对象的属性值赋给taget对象属性
					}
					
					if (sourceValue != null && (!sourceValue.toString().isEmpty()) && targetValue == null) {
						isEqual = false;
						Method targetSetMethod = targetClass.getMethod("set" + sourceMethodName, sourceType);//target属性对应的set方法
						targetSetMethod.invoke(target, sourceValue);	//source对象的属性值赋给taget对象属性
					}
					
					if (sourceValue == null && targetValue != null) {
						isEqual = false;
						Method targetSetMethod = targetClass.getMethod("set" + sourceMethodName, sourceType);//target属性对应的set方法
						targetSetMethod.invoke(target, sourceValue);	//source对象的属性值赋给taget对象属性
					}
					
					break;
				}
			}
		}
		
		return isEqual;
	}
}
