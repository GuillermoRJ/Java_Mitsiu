class Reducer {
  static float reduce(float[] nums) {
    float reducer = 0;
    for (float num : nums) {
      reducer += num;
    }
    return reducer;
  }

  public static void main(String[] args) {
    float[] values = {1.1f,2.2f,3.3f};
    float res = reduce(values);
    System.out.println(res);
  }
}
