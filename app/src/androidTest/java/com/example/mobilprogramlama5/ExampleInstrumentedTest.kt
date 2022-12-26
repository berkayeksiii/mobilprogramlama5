Public class Singleton{
//Tanımlanacak değişkenler
    private static Singleton singleton;
    //private şeklinde bir constuctor
    //public türünde getter ve setter
    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
public class Singleton
{
    private String kullaniciAdi;
    private String kullaniciParola;
    private static Singleton singleton;
    private Singleton(){
}
    //Kullanıcı Adı için getter ve setter
    public String getKullaniciAdi(){
    return kullaniciAdi;
}
    public void setKullaniciAdi(String kullaniciAdi){
    this.kullaniciAdi = kullaniciAdi;
}
    // Kullanıcı Parolası için getter ve setter
    public String getKullaniciParola(){
    return kullaniciParola;
}
    public void setKullaniciParola(String kullaniciParola){
    this.kullaniciParola=kullaniciParola;
    public static Singleton getInstance(){
        if (singleton==null){
            singleton = new Singleton();
        }
        return singleton;
        private ActivityMainBinding binding;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityMainBinding.inflate(getLayoutInflater());
            View view = binding.getRoot();
            setContentView(view);
        }
        public void kullaniciGirisi(View view){
            String kullaniciAdi = binding.editTextTextKullaniciAdi.getText().toString();
            String parola = binding.editTextTextKullaniciParola.getText().toString();
//Singletoon tanımlama ve değer atamaları
            Singleton singleton = Singleton.getInstance();
            singleton.setKullaniciAdi(kullaniciAdi);
            singleton.setKullaniciParola(parola);
//Diğer Activity’ye geçiş
            Intent intent = new Intent(this,AnaSayfa.class);
            startActivity(intent);
            private ActivityAnaSayfaBinding binding;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                binding = ActivityAnaSayfaBinding.inflate(getLayoutInflater());
                View view = binding.getRoot();
                setContentView(view);
                String kullaniciAdi = Singleton.getInstance().getKullaniciAdi();
                String parola = Singleton.getInstance().getKullaniciParola();
                binding.textViewKullaniciAdi.setText(kullaniciAdi);
                binding.textViewKullaniciSifresi.setText(parola);