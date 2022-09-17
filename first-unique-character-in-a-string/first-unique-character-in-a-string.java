class Solution {
   public static int firstUniqChar(String s) {

		LinkedHashMap<Character, String[]> map = new LinkedHashMap<Character, String[]>();
		int indexCount = 0;
		for (char value : s.toCharArray()) {

			if (map.containsKey(value)) {
				String[] arr = new String[2];
				arr[0] = "exists";
				arr[1] = String.valueOf(indexCount);
				map.put(value, arr);
			}

			else {
                String[] arr = new String[2];
				arr[0] = "new";
				arr[1] = String.valueOf(indexCount);
				map.put(value, arr);
			}

			indexCount++;
		}

		for (char key : map.keySet()) {
			String[] value = map.get(key);

			if (!value[0].equals("exists")) {
				return Integer.valueOf(value[1]);
			}
		}

		return -1;

	}
}