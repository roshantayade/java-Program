import java.util.Scanner;
class ElectronicProduct
{
	public static void main(String[]args)
	{
		Scanner r=new Scanner (System.in);
		System.out.println("\n*************Wel-Come to My Software************");
		System.out.println("Please select 1 for PC and 2 for Mobile");
		int option=r.nextInt();
		switch(option)
		{
			case 1:
			{
				System.out.println("\t Select the Brand of Laptop: ");
				System.out.println(" 1: HP Laptop \n 2: Dell Laptop \n 3: Asus Laptop \n 4: Acer Laptop \n 5: MI Laptop");
				int a=r.nextInt();
				switch(a)
				{
					case 1:
					{
						System.out.println("Here are Top Model for HP Laptop");
						System.out.println(" 1: HP Laptop 15s-fr2006TU \n 2: HP Gaming Laptop 16-b0370TX \n 3: HP Gaming Laptop 16-b0360TX \n 4: HP Laptop15s-du3563TU \n 5: HP Pavilion Gaming Laptop 15-dk2095TX");
						int laptop=r.nextInt();
						switch (laptop)
						{
							case 1:
							{
								System.out.println("\t!!!!!!!! HP Laptop 15s-fr2006TU !!!!!!!!!! \n \n \t * 11th Generation Intel Core i3 Processor \n \t * Windows 10 Home 64 \n \t * 15.6 inch Diagonal, FHD (1920 * 1080),IPS,micro-edge \n \n \t Included = 1year Warranty \n \t Price = 46,499rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 2:
							{
								System.out.println("\t!!!!!!!! HP Gaming Laptop 16-b0370TX !!!!!!!!!! \n \n \t * 11th Generation Intel Core i7 Processor \n \t * Windows 11 Home \n \t * 16.1 inch Diagonal, QHD(2560 * 1440),IPS,micro-edge \n \n \t Included = 1year Warranty \n \t Price = 1,74,999rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 3:
							{
								System.out.println("\t!!!!!!!! HP Gaming Laptop 16-b0360TX !!!!!!!!!! \n \n \t * 11th Generation Intel Core i7 Processor \n \t * Windows 11 Home \n \t * 16.1 inch Diagonal, FHD(1920 * 1880),IPS,micro-edge \n \n \t Included = 1year Warranty \n \t Price = 1,39,999rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 4:
							{
								System.out.println("\t!!!!!!!! HP Laptop15s-du3563TU !!!!!!!!!! \n \n \t * 11th Generation Intel Core i3 Processor \n \t * Windows 11 Home \n \t * 15.6 inch Diagonal, HD(1366 * 768),micro-edge \n \n \t Included = 1year Warranty \n \t Price = 43,999rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 5:
							{
								System.out.println("\t!!!!!!!! HP Pavilion Gaming Laptop 15-dk2095TX !!!!!!!!!! \n \n \t * 11th Generation Intel Core i5 Processor \n \t * Windows 11 Home \n \t * 15.6 inch Diagonal, FHD(1920 * 1080),IPS,micro-edge \n \n \t Included = 1year Warranty \n \t Price = 73,999rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							default:
							{
								System.out.println("Please choose option between 1-5 only");
							}
								break;
							
						}
					}
					case 2:
					{
						System.out.println("Here are Top Model for DELL Laptop");
						System.out.println(" 1: DELL Inspiron 3501 \n 2: DELL G15 Ryzen 5 Hexa Core 5600H \n 3: Dell G15 i7 10th Gen \n 4: DELL Inspiron Core i7 11th Gen \n 5: DELL G7 Core i9 10th Gen ");
						int laptop=r.nextInt();
						switch (laptop)
						{
							case 1:
							{
								System.out.println("\t!!!!!!!! DELL Inspiron 3501 !!!!!!!!!! \n \n \t * 11th Generation Intel Core i5 Processor \n \t * Windows 10 Home 64 \n \t * 15.6 inch Diagonal, Softmint with MS Office\n \n \t Included = 1year Warranty \n \t Price = 54,990rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 2:
							{
								System.out.println("\t!!!!!!!! DELL G15 Ryzen 5 Hexa Core 5600H !!!!!!!!!! \n \n \t *  8GBRam, 512SSD \n \t * Windows 10 Home 64 \n \t * 4GB Graphics \n \t * NVIDIA GeForce RTX 3050 \n \t * Gaming Laptop \n \t * 15.6inch, Phantom Grey, 2.4kg \n \n \t Included = 1year Warranty \n \t Price = 69,990rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 3:
							{
								System.out.println("\t!!!!!!!! Dell G15 i7 10th Gen !!!!!!!!!! \n \n \t *  16GB, 512SSD \n \t * Windows 10 Home 64 \n \t * 14inch, Dark Shadow Grey, 1.56kg \n \n \t Included = 1year Warranty \n \t Price = 94,990rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 4:
							{
								System.out.println("\t!!!!!!!! DELL Inspiron Core i7 11th Gen !!!!!!!!!! \n \n \t *  16GB, 512SSD \n \t * Windows 10 Home 64 \n \t * 4GB Graphics \n \t * NVIDIA GeForce RTX 3050Ti \n \t * G15-5510 Gaming Laptop \n \t * 15.6inch, Dark Shadow Grey, 2.4kg \n \n \t Included = 1year Warranty \n \t Price = 95,490rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							case 5:
							{
								System.out.println("\t!!!!!!!! DELL G7 Core i9 10th Gen !!!!!!!!!! \n \n \t *  16GB, 1TB SSD \n \t * Windows 10 Home 64 \n \t * 8GB Graphics \n \t * NVIDIA GeForce RTX 2070/300Hz \n \t * G7 7500 Gaming Laptop \n \t * 15.6inch, Black , 2.56kg \n \n \t Included = 1year Warranty \n \t Price = 1,79,990rs");
								System.out.println("\n ***************Thanks For Visit**************");
								break;
							}
							
						}
						
					}
				}
			}
		}
	}
}