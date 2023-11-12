#two classe of the initial componenets of the projet
# driver is going to calls number where he would
#choose which client he wants, then the program will
#direct him to the Handler_id
class client:

    #constructure
    def __init__(self, id, name, hndler):
        self.client_id = id
        self.name = name
        self.handler = hndler



#this is the person responsible
#for the client
class handler:

    def __init__(self, id, name, Phone_nbr):
        self.name = name
        self.Phone_number = Phone_nbr
        self.Handler_id = id
