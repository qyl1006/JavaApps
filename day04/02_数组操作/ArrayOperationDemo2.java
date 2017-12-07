//数组操作2
public class ArrayOperationDemo2 
{
	//需求: 获取数组最大及最少值的方法
	//获取最大值方法
	static int getMax(int[] nums)
	{
		int max = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] > max)
			{
				max = nums[index];
			}
		}
		return max;
	}

	//获取最小值方法
	static int getMin(int[] nums)
	{
		int min = nums[0];//
		for (int index = 1; index < nums.length; index ++ )
		{
			if (nums[index] < min)
			{
				min = nums[index];
			}
		}
		return min;
	}

	//打印数组元素的方法
	static void printArray(String[] arr)
	{
		if (arr == null)
		{
			System.out.println("null");
			return;
		}
		String ret = "[";
		for (int index = 0; index < arr.length; index ++ )
		{
			ret = ret + arr[index];
			if (index != arr.length - 1)
			{
				ret = ret + ", ";
			}
		}
		ret = ret + "]";
		System.out.println(ret);	
	}

	/*
		逆序排列数组元素:
        原数组:[A, B, C, D, E]
        逆序操作
        新数组:[E, D, C, B, A]

		int类型与String类型该方法通用 只需更改方法变量 返回值数据类型
	*/
	//逆序排列数组元素的方法1
	static String[] reverseArray(String[] oldArr)
	{
		String[] newArr = new String[oldArr.length];
		for (int index = oldArr.length - 1; index >= 0 ; index -- )
		{
			newArr[oldArr.length - 1 - index] = oldArr[index];
		}
		return newArr;
	}

//逆序排列数组元素的方法2
	static String[] reverseArray2(String[] oldArr)
	{
		String[] newArr = new String[oldArr.length];
		for (int index = 0; index < oldArr.length ; index ++ )
		{
			newArr[oldArr.length - 1 - index] = oldArr[index];
		}
		return newArr;
	}

	/*
		元素出现索引(第一次/最后一次),线性搜索 的方法
		参数:
			arr: 指从哪个数组中去做查询
			key: 当前需要去查询的元素
			返回 :如果key存在arr数组中,则返回相应的索引; key不存在arr数组中则返回-1
	*/
	//获取元素key在arr数组中出现第一次的索引
	static int indexOf(int[] arr, int key)
	{
		for (int index = 0; index < arr.length; index ++)
		{
			if (arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}

	//获取元素key在arr数组中出现最后一次的索引
	static int lastIndexOf(int[] arr, int key)
	{
		for (int index = arr.length - 1; index >= 0; index --)
		{
			if (arr[index] == key)
			{
				return index;
			}
		}
		return -1;
	}


// main入口
	public static void main(String[] args) 
	{
		int[] nums = new int[]{-2, 3, 7, 0, 3, 4, 3, 3};

		// 调用方法
		int max = ArrayOperationDemo2.getMax(nums); 
		int min = ArrayOperationDemo2.getMin(nums);

		System.out.println("nums数组最大值:" + max);
		System.out.println("nums数组最小值:" + min);

		//调用printArray方法
		String[] arr = new String[]{"1", "3", "5", "7", "9"};
		//String[] arr = null;

		ArrayOperationDemo2.printArray(arr);

		//调用reeverseArray方法 
		arr = ArrayOperationDemo2.reverseArray(arr);
		System.out.println("打印arr数组逆序排列为:");
		ArrayOperationDemo2.printArray(arr);
		System.out.println("===========================");
	
		//调用indexOf方法,,获取元素出现的索引
		System.out.println("第一次出现索引: " + ArrayOperationDemo2.indexOf(nums, 3));
		System.out.println("最后一次出现索引: " + ArrayOperationDemo2.lastIndexOf(nums, 3));

		
		//问题: 方法中return 返回某个值后是不是就停止执行下一步了? 真返回了?  

		
	}



}
