Problem1:
CODING PROBLEM: TAX

* Basic tax is applied at a rate of 10% on all goods except food and medical
  products.
* Import tax is applied at a rate of 5% on all imported goods.
* It is possible for both basic tax and import tax to be applied on a single
  product.

Given a list of items, please generate a receipt. The receipt should include
(1) the name of the items, (2) the final price of each item including tax, (3)
The total amout of tax paid, and (4) the total amount.

程序在/src/tax_price包中，可直接通过Main类中的main方法执行；
input1.txt是输入样例文件，在/src/other_files包中；
最终结果会自动创建（覆盖）/src/other_file包中的output.txt文件。