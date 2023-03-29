# Covid-19-Vaccine-Java-Swing
Covid-19-Vaccine-Java-Swing

![image](https://user-images.githubusercontent.com/68956095/228419803-fd2ca1f5-d9f1-407f-82bc-8a6de8f365b1.png)
4.1. Giao diện đăng nhập
Mô tả: Quản trị viên và nhân viên phải có tài khoản để đăng nhập và sử dụng phần mềm. Sau khi đăng nhập thành công, phần mềm sẽ hiển thị trang chủ với đầy đủ chức năng.
 
Hình 4.1 1 giao diện đăng nhập
 
4.2. Giao diện màn hình chính
Mô tả: sau khi người quản lý hoặc người nhập liệu đăng nhập với vai trò người nhập liệu (Bị giới hạn một số chức năng) và với vai trò của Quản trị viên: Ở Giao diện chính của phần mềm, người dùng có thể thấy được các chức năng của phần mềm.
Ở giao diện chính sẽ có tổng hợp số liệu vắc xin thep từng quận và một số thông tin về tiêm chủng vắc xin.
 
Hình 4.2 1 giao diện Giao diện chính
4.3. Giao diện thống kê
Mô tả: tổng hợp số liệu tiêm mũi tiêm Covid theo ngày bằng biểu đồ line Chart để giúp người quản lý, nhập liệu có thể so sánh. Có thể xem 7 ngày trước hoặc 7 ngày sau bằng cách bấm vào nút màu xanh. Nếu như xem đến hết ngày hôm nay (tức là ngày hiện hành theo lịch biểu) mà chọn xem vào xem 7 ngày trước sẽ báo lỗi vì ngày đó ở trong tương lại và chưa tồn tại mũi tiêm.
 
Hình 4.3 1 giao diện thống kê
4.4. Giao diện người dân
Mô tả: Giao diện người dân dùng để thêm thông tin người dân tiêm chủng vào, có thể thêm xóa, sửa. Ngoài ra có một số chức năng như là xem mới nhất, tất cả hoặc có chức năng nhập mui tiêm nhanh chóng khi có thông tin người dân trong hệ thống.
 
Hình 4.4 1 giao diện thêm thông tin người dân
4.5. Giao diện mũi tiêm
Mô tả: Giao diện mũi tiêm là chức năng dùng để nhập mũi tiêm cho người dân, với các chức năng cơ bản như thêm, xóa, sửa. Chức năng tìm kiếm để lấy ra người dân nhanh nhất và từ đó xử lý hay sửa thông tin người dân. Khi nhập mũi tiêm sẽ kiểm tra độ tuổi, ngày tháng theo liệu trình đã đúng hay chưa, đã tồn tại mũi đó hay chưa và từ đó cập nhật số lượng khi thêm, xóa một mũi tiêm.
 
Hình 4. 5. Giao diện thêm thông tin mũi tiêm
4.6. Giao diện chứng nhận
Mô tả: Giao diện chứng nhận là Giao diện giao diện tra cứu thông tin người dân từ đó kiểm tra và tạo ra phiếu chứng nhận. Nếu như 1 người chỉ mới tiêm một 1 sẽ có phiếu chứng nhận QR màu vàng và từ 2 mũi trở lên sẽ có phiểu chứng nhận QR màu xanh. Chức năng in phiếu chứng nhận sẽ tạo ra phiếu chứng nhận bằng file Pdf hay Word ….
 
Giấy chứng nhận mũi vàng khi người dân tiêm lơn hơn 2 mũi vắc xin.
 
Hình 4.6 1 giao diện tra cứu thông tin chứng nhận màu xanh
Giấy chứng nhận mũi vàng khi người dân tiêm một 1 vắc xin.
 
Hình 4.6 2 giao diện tra cứu thông tin chứng nhận màu vàng
4.7. Giao diện cài đặt
Mô tả: Giao diện cài đặt dùng để cài đặt thay đổi giao diện tùy thích theo người quản lý và người nhập liệu. Ngoài ra chức năng đổi mật khẩu dùng để đổi mật khẩu đang nhập hiện tại.
 
Hình 4.7 1 giao diện cài đặt đổi giao diện, đổi mật khẩu
Khi nhấn vào chức năng đổi mật khẩu thì giao diện mật khẩu sẽ hiện ra và phải nhập đúng mật khẩu và tạo mật khẩu mới phải khác với mật cũ, xác nhận mật khẩu phải trùng khớp với mật khẩu mới.
 
Hình 4.7 2 giao diện đổi mật khẩu
4.8. Giao diện quản lý tài khoản
Giao diện quản lý tài khoản dùng cho người quản lý và có chức năng để quản lý tất cả các tài khoản hay có thể xóa, cập nhật quyền nhưng tài khoản admin (quản lý) sẽ là tài khoản mặc định và không thể xóa cũng như thay đổi quyền.
 
Hình 4.8 1 giao diện quản lý tài khoản
4.9. Giao diện tạo tài khoản mới
Giao diện tạo tài khoản mới dùng để tạo ra tài khoản mới với quyền nhập liệu hay quản ý, Chức năng chỉ dành cho người quản lý mới được sử dụng.
 
Hình 4.9 1 giao diện tạo tài khoản mới 
4.10. Giao diện tìm kiếm người dân
Mô tả: tìm kiếm người dân theo tên, mã nhân viên và số điện thoại.
 
Hình 4.10 1 giao diện kiếm thông tin người dân
4.11. Giao diện tìm kiếm nhân viên y tế
Mô tả: tìm kiếm nhân viên y tế theo tên, mã nhân viên và số điện thoại.
 
Hình 4.11 1 giao diện tìm kiếm nhân viên y tế
4.12. Giao diện thống kê nhân viên y tế
Mô tả: thống kê nhân viên y tế làm việc trong tháng hoặc trong khu vực.
 
Hình 4.12 1 giao diện thống kê nhân viên y tế
4.13. Giao diện thống kê danh sách người dân
Mô tả: thống kê người dân đã tiêm vacxin theo ngày, theo tháng, theo loại vacxin và theo khu vực.
 
Hình 4.13 1 giao diện thông kê danh sách người dân
4.14. Giao diện thêm một loại vắc xin
Mô tả: cập nhật thông tin loại vacxin.
 
Hình 4.14 1 giao diện giao diện thêm một loại vắc xin
4.15. Giao diện thêm lô vắc xin
Mô tả: cập nhật thông tin lô vacxin.
 
Hình 4.15 1 giao diện giao diện thêm lô vắc xin
4.16. Giao diện thêm danh sách tiêm
Mô tả: cập nhật thông tin danh sách tiêm.
 
Hình 4.16 1 giao diện giao diện thêm danh sách tiêm
4.17. Giao diện thêm đội ngũ y tế
Mô tả: cập nhật thông tin đội ngũ y tế.
 
Hình 4.17 1 giao diện giao diện thêm đội ngũ y tế
4.18. Giao diện thêm phường
Mô tả: cập nhật thông tin phường.
 
Hình 4.18 1 giao diện giao diện thêm phường
4.19. Giao diện thêm quận
Mô tả: cập nhật thông tin quận.
 
Hình 4.19 1 giao diện giao diện thêm phường
Hình 4. 19. Giao diện giao diện thêm quận
4.20. Giao diện thêm nhân viên y tế
Mô tả: cập nhật thông tin nhân viên y tế.
 
Hình 4.20 1 giao diện giao diện thêm nhân viên y tế 
4.21. Giao diện thêm đợt tiêm
Mô tả: cập nhật thông tin đợt tiêm.
 
Hình 4.21 1 giao diện giao diện thêm đợt tiêm
