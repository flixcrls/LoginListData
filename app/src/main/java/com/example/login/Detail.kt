package com.example.login


import com.google.gson.annotations.SerializedName

data class Detail(
    @SerializedName("biaya_asuransi")
    val biayaAsuransi: Int,
    @SerializedName("biaya_bongkar")
    val biayaBongkar: Int,
    @SerializedName("biaya_inap")
    val biayaInap: Int,
    @SerializedName("biaya_kawalan")
    val biayaKawalan: Int,
    @SerializedName("biaya_layanan_shipper")
    val biayaLayananShipper: Int,
    @SerializedName("biaya_layanan_transporter")
    val biayaLayananTransporter: Int,
    @SerializedName("brand")
    val brand: String,
    @SerializedName("capacity")
    val capacity: Int,
    @SerializedName("catatan")
    val catatan: String,
    @SerializedName("date_from")
    val dateFrom: String,
    @SerializedName("date_to")
    val dateTo: String,
    @SerializedName("email_driver")
    val emailDriver: String,
    @SerializedName("est")
    val est: Int,
    @SerializedName("fee")
    val fee: Any,
    @SerializedName("flag_invoice")
    val flagInvoice: Int,
    @SerializedName("flag_release")
    val flagRelease: Int,
    @SerializedName("foto_bukti_filepath")
    val fotoBuktiFilepath: Any,
    @SerializedName("harga")
    val harga: Int,
    @SerializedName("heigth")
    val heigth: Int,
    @SerializedName("id_driver")
    val idDriver: Int,
    @SerializedName("id_order")
    val idOrder: Int,
    @SerializedName("id_order_detail")
    val idOrderDetail: Int,
    @SerializedName("id_produk_transporter")
    val idProdukTransporter: Int,
    @SerializedName("id_route")
    val idRoute: Int,
    @SerializedName("id_shipper")
    val idShipper: Int,
    @SerializedName("id_top")
    val idTop: Int,
    @SerializedName("id_transporter")
    val idTransporter: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("image_transporter")
    val imageTransporter: Any,
    @SerializedName("image_truck")
    val imageTruck: String,
    @SerializedName("jenis_kendaraan")
    val jenisKendaraan: String,
    @SerializedName("jml_bayar")
    val jmlBayar: Int,
    @SerializedName("kab_asal")
    val kabAsal: String,
    @SerializedName("kab_tujuan")
    val kabTujuan: String,
    @SerializedName("kode_route")
    val kodeRoute: String,
    @SerializedName("length")
    val length: Int,
    @SerializedName("nama_driver")
    val namaDriver: String,
    @SerializedName("nama_perjanjian")
    val namaPerjanjian: String,
    @SerializedName("nama_route")
    val namaRoute: String,
    @SerializedName("nama_transporter")
    val namaTransporter: String,
    @SerializedName("no_order")
    val noOrder: String,
    @SerializedName("no_surat_jalan")
    val noSuratJalan: String,
    @SerializedName("nohp_driver")
    val nohpDriver: String,
    @SerializedName("police_no")
    val policeNo: String,
    @SerializedName("pph23")
    val pph23: Int,
    @SerializedName("ppn_shipper")
    val ppnShipper: Int,
    @SerializedName("prov_asal")
    val provAsal: String,
    @SerializedName("prov_tujuan")
    val provTujuan: String,
    @SerializedName("status")
    val status: Int,
    @SerializedName("status_pembayaran")
    val statusPembayaran: Int,
    @SerializedName("status_pengiriman")
    val statusPengiriman: String,
    @SerializedName("tgl_order")
    val tglOrder: String,
    @SerializedName("tgl_pengiriman")
    val tglPengiriman: String,
    @SerializedName("tipe_layanan")
    val tipeLayanan: String,
    @SerializedName("tipe_order")
    val tipeOrder: Int,
    @SerializedName("tipe_pengiriman")
    val tipePengiriman: String,
    @SerializedName("tipe_schedule")
    val tipeSchedule: Int,
    @SerializedName("total_harga")
    val totalHarga: Int,
    @SerializedName("total_harga_to_transporter")
    val totalHargaToTransporter: Any,
    @SerializedName("width")
    val width: Int
)