import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		String userName, password, newPassword;
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
		
		System.out.print("Lütfen şifrenizi giriniz : ");
        password = input.nextLine();
	
	    if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
	    
	    }
	    else{
            System.out.println("Giriş Başarısız!");
            System.out.println("Şifrenizi Sıfırlamak İster misiniz? (E/H)");
         
	    }  
	    
	    String select;
	    select = input.nextLine();
	    
	    switch(select){
	    case "E":
	    case "e":     
                System.out.print("Yeni Şifrenizi Giriniz : ");
                newPassword = input.nextLine();

                if(newPassword.equals("java123")){
                System.out.print("Şifre değiştirilemedi. Yeni Şifreniz Eskisiyle Aynı Olamaz");
                }
                else{
                System.out.print("Tebrikler, Yeni Şifreniz Başarıyla oluşturuldu" + 
                "\nYeni Şifreniz :" + newPassword);
                }
                break;
        case "H":
        case "h":    
                System.out.print("Şifrenizi Değiştirmek İstemediniz");
                break;
        default:
                System.out.print("Geçersiz Bir Seçim Yaptınız");
	        
	        }
        }
	    
	}
	
