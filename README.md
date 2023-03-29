# Covid-19-Vaccine-Java-Swing
Covid-19-Vaccine-Java-Swing

<h4>1. Giao diện đăng nhập</h4>
<p>Mô tả: Quản trị viên và nhân viên phải có tài khoản để đăng nhập và sử dụng phần mềm. Sau khi đăng nhập thành công, phần mềm sẽ hiển thị trang chủ với đầy đủ chức năng.</p>
<img src = "https://user-images.githubusercontent.com/68956095/228419803-fd2ca1f5-d9f1-407f-82bc-8a6de8f365b1.png"></img>
Hình 4.1 1 giao diện đăng nhập
 
<h4>2. Giao diện màn hình chính</h4>
<p>Mô tả: sau khi người quản lý hoặc người nhập liệu đăng nhập với vai trò người nhập liệu (Bị giới hạn một số chức năng) và với vai trò của Quản trị viên: Ở Giao diện chính của phần mềm, người dùng có thể thấy được các chức năng của phần mềm.
Ở giao diện chính sẽ có tổng hợp số liệu vắc xin thep từng quận và một số thông tin về tiêm chủng vắc xin.</p>
 <img src =https://user-images.githubusercontent.com/68956095/228419934-f13006bc-3115-43ac-a69e-9f1e4ecd4361.png></img>
Hình 4.2 1 giao diện Giao diện chính

<h4>3. Giao diện thống kê</h4>
<p>Mô tả: tổng hợp số liệu tiêm mũi tiêm Covid theo ngày bằng biểu đồ line Chart để giúp người quản lý, nhập liệu có thể so sánh. Có thể xem 7 ngày trước hoặc 7 ngày sau bằng cách bấm vào nút màu xanh. Nếu như xem đến hết ngày hôm nay (tức là ngày hiện hành theo lịch biểu) mà chọn xem vào xem 7 ngày trước sẽ báo lỗi vì ngày đó ở trong tương lại và chưa tồn tại mũi tiêm.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420009-16a53946-c31f-496f-86fc-72ead8e575b8.png></img>
Hình 4.3 1 giao diện thống kê

<h4>4. Giao diện người dân</h4>
<p>Mô tả: Giao diện người dân dùng để thêm thông tin người dân tiêm chủng vào, có thể thêm xóa, sửa. Ngoài ra có một số chức năng như là xem mới nhất, tất cả hoặc có chức năng nhập mui tiêm nhanh chóng khi có thông tin người dân trong hệ thống.</p>
 <img src =https://user-images.githubusercontent.com/68956095/228420034-801ab24d-3ef0-44bd-9952-7eaa86649cba.png></img>
Hình 4.4 1 giao diện thêm thông tin người dân

<h4>5. Giao diện mũi tiêm</h4>
<p>Mô tả: Giao diện mũi tiêm là chức năng dùng để nhập mũi tiêm cho người dân, với các chức năng cơ bản như thêm, xóa, sửa. Chức năng tìm kiếm để lấy ra người dân nhanh nhất và từ đó xử lý hay sửa thông tin người dân. Khi nhập mũi tiêm sẽ kiểm tra độ tuổi, ngày tháng theo liệu trình đã đúng hay chưa, đã tồn tại mũi đó hay chưa và từ đó cập nhật số lượng khi thêm, xóa một mũi tiêm.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420068-72bba85c-178c-46df-971f-d6fd1bdccce5.png></img>
Hình 4. 5. Giao diện thêm thông tin mũi tiêm

<h4>6. Giao diện chứng nhận</h4>
<p>Mô tả: Giao diện chứng nhận là Giao diện giao diện tra cứu thông tin người dân từ đó kiểm tra và tạo ra phiếu chứng nhận. Nếu như 1 người chỉ mới tiêm một 1 sẽ có phiếu chứng nhận QR màu vàng và từ 2 mũi trở lên sẽ có phiểu chứng nhận QR màu xanh. Chức năng in phiếu chứng nhận sẽ tạo ra phiếu chứng nhận bằng file Pdf hay Word ….
 
Giấy chứng nhận mũi vàng khi người dân tiêm lớn hơn 2 mũi vắc xin.</p> 
<img src =https://user-images.githubusercontent.com/68956095/228420096-c4ee9eed-e46c-4998-8019-a6208d7898a5.png></img>
Hình 4.6 1 giao diện tra cứu thông tin chứng nhận màu xanh
Giấy chứng nhận mũi vàng khi người dân tiêm một 1 vắc xin.

 <img src =https://user-images.githubusercontent.com/68956095/228420109-2b722ad9-b5bc-4572-9f86-0ed836b842b3.png></img>
Hình 4.6 2 giao diện tra cứu thông tin chứng nhận màu vàng

<h4>7. Giao diện cài đặt</h4>
<p>Mô tả: Giao diện cài đặt dùng để cài đặt thay đổi giao diện tùy thích theo người quản lý và người nhập liệu. Ngoài ra chức năng đổi mật khẩu dùng để đổi mật khẩu đang nhập hiện tại.</p>
 <img src =https://user-images.githubusercontent.com/68956095/228420638-a22b8376-a237-47a0-bd81-409c95ad3048.png></img>
Hình 4.7 1 giao diện cài đặt đổi giao diện, đổi mật khẩu

<p>Khi nhấn vào chức năng đổi mật khẩu thì giao diện mật khẩu sẽ hiện ra và phải nhập đúng mật khẩu và tạo mật khẩu mới phải khác với mật cũ, xác nhận mật khẩu phải trùng khớp với mật khẩu mới.</p>
 <img src =https://user-images.githubusercontent.com/68956095/228420691-ab8b10b2-24d5-431c-8106-bf3c50c03655.png></img>
Hình 4.7 2 giao diện đổi mật khẩu

<h4>8. Giao diện quản lý tài khoản</h4>
<p>Giao diện quản lý tài khoản dùng cho người quản lý và có chức năng để quản lý tất cả các tài khoản hay có thể xóa, cập nhật quyền nhưng tài khoản admin (quản lý) sẽ là tài khoản mặc định và không thể xóa cũng như thay đổi quyền.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420735-aef87213-aaed-4de3-a5e0-8458f11fa2dd.png></img>
Hình 4.8 1 giao diện quản lý tài khoản

<h4>9. Giao diện tạo tài khoản mới</h4>
<p>Giao diện tạo tài khoản mới dùng để tạo ra tài khoản mới với quyền nhập liệu hay quản ý, Chức năng chỉ dành cho người quản lý mới được sử dụng.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420766-5c3da75f-57a8-4149-8c92-d9b8f6f9b325.png></img>
Hình 4.9 1 giao diện tạo tài khoản mới 

<h4>10. Giao diện tìm kiếm người dân</h4>
<p>Mô tả: tìm kiếm người dân theo tên, mã nhân viên và số điện thoại.</p>
 <img src =https://user-images.githubusercontent.com/68956095/228420791-e856afc7-1b4b-4a12-98d7-c9f06a1b9cbb.png></img>
Hình 4.10 1 giao diện kiếm thông tin người dân

<h4>11. Giao diện tìm kiếm nhân viên y tế</h4>
<p>Mô tả: tìm kiếm nhân viên y tế theo tên, mã nhân viên và số điện thoại.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420820-b740f90f-bc25-45b7-9ab5-d2f65ef8a107.png></img>
Hình 4.11 1 giao diện tìm kiếm nhân viên y tế

<h4>12. Giao diện thống kê nhân viên y tế</h4>
<p>Mô tả: thống kê nhân viên y tế làm việc trong tháng hoặc trong khu vực.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420847-2a8e5258-6507-4964-adc4-ef18768c40dc.png></img>
Hình 4.12 1 giao diện thống kê nhân viên y tế

<h4>13. Giao diện thống kê danh sách người dân</h4>
<p>Mô tả: thống kê người dân đã tiêm vacxin theo ngày, theo tháng, theo loại vacxin và theo khu vực.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420872-203cc66a-22a9-4b0a-82fe-ab5af6582ca3.png></img>
Hình 4.13 1 giao diện thông kê danh sách người dân

<h4>14. Giao diện thêm một loại vắc xin</h4>
<p>Mô tả: cập nhật thông tin loại vacxin.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420906-61e4fab2-cf13-4d25-9688-b2003c09a3ec.png></img>
Hình 4.14 1 giao diện giao diện thêm một loại vắc xin

<h4>15. Giao diện thêm lô vắc xin</h4>
<p>Mô tả: cập nhật thông tin lô vacxin.</p>
<img src =(https://user-images.githubusercontent.com/68956095/228420930-ba661ded-7659-41d8-9303-6c4c57ee7884.png></img>
Hình 4.15 1 giao diện giao diện thêm lô vắc xin

<h4>16. Giao diện thêm danh sách tiêm</h4>
<p>Mô tả: cập nhật thông tin danh sách tiêm.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420956-f6e414a3-b382-413f-b03f-07ac0e594f21.png></img>
Hình 4.16 1 giao diện giao diện thêm danh sách tiêm

<h4>17. Giao diện thêm đội ngũ y tế</h4>
<p>Mô tả: cập nhật thông tin đội ngũ y tế.</p>
<img src =https://user-images.githubusercontent.com/68956095/228420995-7589f644-2a00-40b5-b415-b90bef303615.png></img>
Hình 4.17 1 giao diện giao diện thêm đội ngũ y tế

<h4>18. Giao diện thêm phường</h4>
<p>Mô tả: cập nhật thông tin phường.</p>
<img src =https://user-images.githubusercontent.com/68956095/228421012-a1a6e278-94da-454c-b783-77f40abf342f.png></img>
Hình 4.18 1 giao diện giao diện thêm phường

<h4>19. Giao diện thêm quận</h4>
<p>Mô tả: cập nhật thông tin quận.</p>
<img src =https://user-images.githubusercontent.com/68956095/228421029-ad8886a8-98be-4186-9859-943dd4f5f4c6.png></img>
Hình 4.19 1 giao diện giao diện thêm phường

<h4>20. Giao diện thêm nhân viên y tế</h4>
<p>Mô tả: cập nhật thông tin nhân viên y tế.</p>
<img src =https://user-images.githubusercontent.com/68956095/228421053-8b7a1354-f225-4433-bae4-92a6d652a62a.png></img>
Hình 4.20 1 giao diện giao diện thêm nhân viên y tế 

<h4>21. Giao diện thêm đợt tiêm</h4>
<p>Mô tả: cập nhật thông tin đợt tiêm.</p>
<img src =https://user-images.githubusercontent.com/68956095/228421077-d9e9669a-a1f8-48f8-ba71-f0a6cab4f809.png></img>
Hình 4.21 1 giao diện giao diện thêm đợt tiêm
