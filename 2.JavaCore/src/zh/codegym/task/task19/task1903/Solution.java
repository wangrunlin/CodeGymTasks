package zh.codegym.task.task19.task1903;

/* 
适配多个接口
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static Map<String, String> countries = new HashMap<>();

    static {
        countries.put("UA", "乌克兰");
        countries.put("US", "美国");
        countries.put("FR", "法国");
    }

    public static void main(String[] args) {
        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(new IncomeData() {
            @Override
            public String getCountryCode() {
                return null;
            }

            @Override
            public String getCompany() {
                return null;
            }

            @Override
            public String getContactFirstName() {
                return null;
            }

            @Override
            public String getContactLastName() {
                return null;
            }

            @Override
            public int getCountryPhoneCode() {
                return 3;
            }

            @Override
            public int getPhoneNumber() {
                return 991234567;
            }
        });

        System.out.println(incomeDataAdapter.getPhoneNumber());
    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String input = String.valueOf(String.format("%010d", data.getPhoneNumber()));

            return String.format("+%d(%3s)%3s-%2s-%2s", data.getCountryPhoneCode(),
                    input.substring(0, 3), input.substring(3, 6), input.substring(6, 8), input.substring(8, 10));
//            return "+" + data.getCountryPhoneCode() + "(" + input.substring(0, 3)+")"
//                    +input.substring(3, 6)+"-"+input.substring(6, 8)+"-"+input.substring(8, 10);
        }
    }

    public static interface IncomeData {
        String getCountryCode();        // 例如：US

        String getCompany();            // 例如：CodeGym Ltd.

        String getContactFirstName();   // 例如：约翰

        String getContactLastName();    // 例如：史密斯

        int getCountryPhoneCode();      // 例如：1

        int getPhoneNumber();           // 例如：991234567
    }

    public static interface Customer {
        String getCompanyName();        // 例如：CodeGym Ltd.

        String getCountryName();        // 例如：美国
    }

    public static interface Contact {
        String getName();               // 例如：史密斯, 约翰

        String getPhoneNumber();        // 例如：+1(099)123-45-67
    }
}