package dcms;


/**
* dcms/DCMSHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from dcms.idl
* Friday, June 16, 2017 5:25:01 o'clock PM EDT
*/

abstract public class DCMSHelper
{
  private static String  _id = "IDL:dcms/DCMS:1.0";

  public static void insert (org.omg.CORBA.Any a, dcms.DCMS that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static dcms.DCMS extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (dcms.DCMSHelper.id (), "DCMS");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static dcms.DCMS read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_DCMSStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, dcms.DCMS value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static dcms.DCMS narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof dcms.DCMS)
      return (dcms.DCMS)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      dcms._DCMSStub stub = new dcms._DCMSStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static dcms.DCMS unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof dcms.DCMS)
      return (dcms.DCMS)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      dcms._DCMSStub stub = new dcms._DCMSStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
