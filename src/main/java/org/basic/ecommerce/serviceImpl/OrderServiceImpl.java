package org.basic.ecommerce.serviceImpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.basic.ecommerce.dto.OrderDetailsDTO;
import org.basic.ecommerce.dto.ProductDetailsDTO;
import org.basic.ecommerce.dto.UserDetailDTO;
import org.basic.ecommerce.service.OrderService;
import org.basic.ecommerce.utils.ConfigsUtils;
import org.basic.ecommerce.utils.PropertiesUtils;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class OrderServiceImpl implements OrderService {

	@Override
	public OrderDetailsDTO getOrderByid(String orderId) {
		OrderDetailsDTO order = new OrderDetailsDTO();
		ArrayList<ProductDetailsDTO> productsList = new ArrayList<ProductDetailsDTO>();
		ProductDetailsDTO product = new ProductDetailsDTO();
		product.setTitle("ProductTitle1");
		product.setDescription("This is product description 1");
		product.setPrice(100);
		product.setImage("s3/img/product1image");
		product.setSkuid("P0001");
		ArrayList<String> reviews = new ArrayList<String>();
		reviews.add("Product1Review1");
		reviews.add("Product1Review2");
		reviews.add("Product1Review3");
		product.setReviews(reviews);
		product.setReviewCount(reviews.size());

		ProductDetailsDTO product2 = new ProductDetailsDTO();
		product2.setTitle("ProductTitle2");
		product2.setDescription("This is product description 2");
		product2.setPrice(200);
		product2.setImage("s3/img/product2image");
		product2.setSkuid("P0002");
		ArrayList<String> reviews2 = new ArrayList<String>();
		reviews2.add("Product2Review1");
		reviews2.add("Product2Review2");
		product2.setReviews(reviews2);
		product2.setReviewCount(reviews2.size());

		ProductDetailsDTO product3 = new ProductDetailsDTO();
		product3.setTitle("ProductTitle3");
		product3.setDescription("This is product description 3");
		product3.setPrice(130);
		product3.setImage("s3/img/product3image");
		product3.setSkuid("P0003");
		ArrayList<String> reviews3 = new ArrayList<String>();
		reviews3.add("Product3Review1");
		reviews3.add("Product3Review3");
		reviews3.add("Product3Review4");
		reviews3.add("Product3Review2");
		product3.setReviews(reviews3);
		product3.setReviewCount(reviews3.size());

		productsList.add(product);
		productsList.add(product2);
		productsList.add(product3);
		order.setOrderId("O0001");
		order.setProducts(productsList);
		order.setTotalAmount(430);
		order.setTotalQuantity(3);
		order.setPlacedAt(new Date());
		UserDetailDTO user = new UserDetailDTO();
		user.setEmail("arpitmittal555@gmail.com");
		UserDetailDTO seller = new UserDetailDTO();
		seller.setEmail("arpitmittal555@gmail.com");
		seller.setName("DemoSeller");
		order.setUser(user);
		order.setSeller(seller);
		return order;
	}

	@Override
	public List<OrderDetailsDTO> getOrdersByUser(String userId) {
		OrderDetailsDTO order = new OrderDetailsDTO();
		ArrayList<ProductDetailsDTO> productsList = new ArrayList<ProductDetailsDTO>();
		ProductDetailsDTO product = new ProductDetailsDTO();
		product.setTitle("ProductTitle1");
		product.setDescription("This is product description 1");
		product.setPrice(100);
		product.setImage("s3/img/product1image");
		product.setSkuid("P0001");
		ArrayList<String> reviews = new ArrayList<String>();
		reviews.add("Product1Review1");
		reviews.add("Product1Review2");
		reviews.add("Product1Review3");
		product.setReviews(reviews);
		product.setReviewCount(reviews.size());

		ProductDetailsDTO product2 = new ProductDetailsDTO();
		product2.setTitle("ProductTitle2");
		product2.setDescription("This is product description 2");
		product2.setPrice(200);
		product2.setImage("s3/img/product2image");
		product2.setSkuid("P0002");
		ArrayList<String> reviews2 = new ArrayList<String>();
		reviews2.add("Product2Review1");
		reviews2.add("Product2Review2");
		product2.setReviews(reviews2);
		product2.setReviewCount(reviews2.size());

		ProductDetailsDTO product3 = new ProductDetailsDTO();
		product3.setTitle("ProductTitle3");
		product3.setDescription("This is product description 3");
		product3.setPrice(130);
		product3.setImage("s3/img/product3image");
		product3.setSkuid("P0003");
		ArrayList<String> reviews3 = new ArrayList<String>();
		reviews3.add("Product3Review1");
		reviews3.add("Product3Review3");
		reviews3.add("Product3Review4");
		reviews3.add("Product3Review2");
		product3.setReviews(reviews3);
		product3.setReviewCount(reviews3.size());

		productsList.add(product);
		productsList.add(product2);
		productsList.add(product3);
		order.setOrderId("O0001");
		order.setProducts(productsList);
		order.setTotalAmount(430);
		order.setTotalQuantity(3);
		order.setPlacedAt(new Date());

		OrderDetailsDTO order2 = new OrderDetailsDTO();
		ArrayList<ProductDetailsDTO> productsList2 = new ArrayList<ProductDetailsDTO>();
		ProductDetailsDTO product4 = new ProductDetailsDTO();
		product4.setTitle("ProductTitle1");
		product4.setDescription("This is product description 1");
		product4.setPrice(150);
		product4.setImage("s3/img/product1image");
		product4.setSkuid("P0001");
		ArrayList<String> reviews4 = new ArrayList<String>();
		reviews4.add("Product4Review1");
		reviews4.add("Product4Review2");
		product4.setReviews(reviews4);
		product4.setReviewCount(reviews4.size());

		ProductDetailsDTO product5 = new ProductDetailsDTO();
		product5.setTitle("ProductTitle2");
		product5.setDescription("This is product description 2");
		product5.setPrice(120);
		product5.setImage("s3/img/product2image");
		product5.setSkuid("P0002");
		ArrayList<String> reviews5 = new ArrayList<String>();
		reviews5.add("Product5Review1");
		product5.setReviews(reviews5);
		product5.setReviewCount(reviews5.size());

		productsList2.add(product4);
		productsList2.add(product5);
		order2.setOrderId("O0002");
		order2.setProducts(productsList2);
		order2.setTotalAmount(270);
		order2.setTotalQuantity(2);
		order2.setPlacedAt(new Date());

		ArrayList<OrderDetailsDTO> orders = new ArrayList<OrderDetailsDTO>();
		orders.add(order);
		orders.add(order2);
		return orders;
	}

	@Override
	public File placeOrder() {
		// TODO Auto-generated method stub
		// get Session Cart from Session and Convert it to Order and place it
		// Let converted Order be following
		OrderDetailsDTO order = getOrderByid("");

		try {
			Document document = new Document();
			FileOutputStream out = new FileOutputStream(order.getOrderId() + ".pdf");
			PdfWriter.getInstance(document, out);

			document.open();
			PdfPTable table = new PdfPTable(2);
			Stream.of("Particulars", "Details").forEach(columnTitle -> {
				PdfPCell header = new PdfPCell();
				header.setBackgroundColor(BaseColor.LIGHT_GRAY);
				header.setBorderWidth(2);
				header.setPhrase(new Phrase(columnTitle));
				table.addCell(header);
			});

			table.addCell("Order Id");
			table.addCell(order.getOrderId());
			table.addCell("Total Amount");
			table.addCell(String.valueOf(order.getTotalAmount()));
			table.addCell("Products");

			StringBuffer products = new StringBuffer();
			for (ProductDetailsDTO product : order.getProducts()) {
				products.append(product.getTitle() + ",");
			}
			table.addCell(products.toString());
			table.addCell("Seller Name");
			table.addCell(order.getSeller().getName());

			document.add(table);
			document.close();

			// uploadFileToS3(document, out, order);
			emailOrderDetailsToSeller(document, out, order);
			emailOrderDetailsToBuyer(document, out, order);
		} catch (DocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private void uploadFileToS3(Document file, FileOutputStream out, OrderDetailsDTO order) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = new FileInputStream("my.pdf");
		ObjectMetadata meta = new ObjectMetadata();
		meta.setContentLength(is.available());
		// configure S3 client accordingly
		AmazonS3 s3Client = null;
		s3Client.putObject(new PutObjectRequest("", "", is, meta).withCannedAcl(CannedAccessControlList.Private));
	}

	private void emailOrderDetailsToBuyer(Document file, FileOutputStream out, OrderDetailsDTO order) {
		String subject = "Buyer Email - Your Purchase Order " + order.getOrderId() + " was placed!";
		String mailbody = "Thank You for placing an order. Please find the Purchase document as attached";
		emailOrderDetails(order, file, out, order.getUser().getEmail(), subject, mailbody);
	}

	private void emailOrderDetailsToSeller(Document file, FileOutputStream out, OrderDetailsDTO order) {
		String subject = "Seller Email - A New Order " + order.getOrderId() + " created!";
		String mailbody = "Please find the Purchase document as attached and process the Order";
		emailOrderDetails(order, file, out, order.getSeller().getEmail(), subject, mailbody);
	}

	private void emailOrderDetails(OrderDetailsDTO order, Document file, FileOutputStream out, String email,
			String subject, String mailbody) {
		String to = email;
		String from = "noreply@basicecommerce.com";
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", PropertiesUtils.readPropertiesFromFile(ConfigsUtils.smtpHost));
		properties.put("mail.smtp.port", PropertiesUtils.readPropertiesFromFile(ConfigsUtils.smtpPort));
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(PropertiesUtils.readPropertiesFromFile(ConfigsUtils.emailFromUser),
						PropertiesUtils.readPropertiesFromFile(ConfigsUtils.emailFromPass));
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(subject);
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(mailbody);
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			String filename = order.getOrderId() + ".pdf";
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);
			Transport.send(message);
		} catch (MessagingException mex) {
			mex.printStackTrace();
		} catch (Exception mex) {
			mex.printStackTrace();
		}
	}

}
