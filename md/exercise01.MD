## Bài tập 1 (<u>deadline</u> ***2024-10-26***)

Viết chương trình tính thuế thu nhập cá nhân Việt Nam (theo luật 2024).

### Input

* Lương cơ bản (lương đóng BH), `>= 5100000`
* Thu nhập thực tế `>= 0`
* Số người phụ thuộc `>= 0`

### Output

* Số tiền đóng BH
* Số tiền phải nộp thuế
* Thu nhập thực lĩnh (net income)

### Các thông tin cần sử dụng cho việc tính toán:

* Phần trăm đóng bảo hiểm: BHXH: 8%
* BHYT: 1.5%
* BH thất nghiệp: 1%
* Thu nhập miễn thuế: 11.000.000
* Giảm trừ gia cảnh người phụ thuộc: 4.400.000/người
* Các bậc thuế luỹ tiến:
    * Mức 1 (5.000.000): 5%
    * Mức 2 (10.000.000): 10%
    * Mức 3 (18.000.000): 15%
    * Mức 4 (32.000.000): 20%
    * Mức 5 (52.000.000): 25%
    * Mức 6 (80.000.000): 30%
    * Mức 7 (trên 80.000.000): 35%

### Giao diện:

```text
Nhập vào lương đóng BH: 5100000
Nhập vào lương trước thuế: 15000000
Số người phụ thuộc: 0

Tiền đóng BH: 535500.00
Thuế TNCN: 173255.00
Thu nhập thực lãnh: 14291275.00
```

Để hiển thị đúng format số thập phân hai chữ số sau dấu phẩy, sử dụng hàm `setScale(int, RoundingMode)`, ví dụ: 

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

static BigDecimal format(double number) {
    return BigDecimal.valueOf(number).setScale(2, RoundingMode.CEILING);
}
```

Tham khảo: [Tính thuế thu nhập cá nhân](https://www.topcv.vn/tinh-thue-thu-nhap-ca-nhan)