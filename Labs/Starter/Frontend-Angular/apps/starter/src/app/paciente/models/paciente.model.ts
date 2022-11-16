
export interface Paciente {
    id: number,
    nome: string,
    cpf: string,
    dataNascimento: string,
    //enderecos: Endereco[];
    telefone?: string[];
    email: string,
}
